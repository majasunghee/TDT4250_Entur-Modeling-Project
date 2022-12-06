package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.databind.JsonNode;

import pojo.LinesClass;
import pojo.OperatorClass;
import pojo.SpecificLineClass;
import resources.PojoMapper;
import transportModel.DirectionType;
import transportModel.journeyPatterns;
import transportModel.lines;
import transportModel.operator;
import transportModel.route;
import transportModel.specificLine;
import transportModel.stopPlace;
import transportModel.transportOrg;
import transportModel.TransportModelFactory;
import transportModel.TransportModelPackage;
import transportModel.TransportModeType;


public class ModelMapper {
	public static String xmiPath =  "../tdt4250.entur.pluginProject/src/data/transportOrg.xmi";
	public static final TransportModelFactory FACTORY = TransportModelFactory.eINSTANCE;

	public static void main(String[] args) throws IOException {
		updateModel();
	}
	
	// Sets operator data to model
	public static List<operator> createOperator(transportOrg organization, List<lines> inputLines) throws IOException {
		List<OperatorClass> operatorList = PojoMapper.instantiateOperators();
		List<operator> mappedOperators = new ArrayList<operator>();
		operatorList.forEach(operator -> {
			operator op= FACTORY.createoperator();
			op.setId(operator.getId());
			op.setName(operator.getName());
			op.setPhone(operator.getNumber());
			op.setUrl(operator.getUrl());
			operator.getLines().forEach(opLine -> {
				inputLines.forEach(dataLine -> {
					if (opLine.findValues("id").get(0).toString().equals('"' + dataLine.getId().toString() + '"')) {
						op.getHasLines().add(dataLine);
					}
				});
			});
			mappedOperators.add(op);
		});
		return mappedOperators;
	}
	
	//Sets line data to model
	public static List<lines> createLines(transportOrg organization) throws IOException {
		List<LinesClass> linesList = PojoMapper.instantiateLines();
		List<lines> mappedLines = new ArrayList<lines>();
		linesList.forEach(lines -> {
			lines line= FACTORY.createlines();
			line.setId(lines.getId());
			line.setName(lines.getName());
			line.setTransportMode(lines.getTransportMode());
			line.setBikesAllowed(lines.getBikesAllowed());
			mappedLines.add(line);
		});
		return mappedLines;
	}
	
	//Sets specificLine data to model
	public static SpecificLineClass createSpecificLine(transportOrg organization) throws IOException {
		SpecificLineClass specificLine = PojoMapper.instantiateSpecificLines();
		specificLine specificlineInstance = FACTORY.createspecificLine();
		specificlineInstance.setId(specificLine.getSpecificLineId());
		
		System.out.println(specificLine);
		return specificLine;
	}
	
	public static void updateModel() throws IOException {
		
		//initializing package
		TransportModelPackage.eINSTANCE.eClass(); 
		
		transportOrg organization = FACTORY.createtransportOrg();
		organization.setName("Entur");	
		
		List<lines> mappedLines = createLines(organization);
		
		List<operator> mappedOperators = createOperator(organization, mappedLines);
		organization.getHasOperator().addAll(mappedOperators);
		//System.out.println(mappedOperators);
		
		
		SpecificLineClass specificlineInstance = createSpecificLine(organization);
		
		
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl()); //
				
		
		//creating new resource set
		ResourceSet resourceSet = new ResourceSetImpl();

		//Read from json file and convert content to json string 
		Resource resource = resourceSet.createResource(URI.createFileURI(xmiPath));
		
	
        resource.getContents().add(organization); 

		
			try {
				System.out.println("Saved data to xmi file.");
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				System.out.println("Could not save to xmi file.");
				e.printStackTrace();
			}
	}

}
