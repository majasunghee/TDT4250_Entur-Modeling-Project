package tdt4250.entur.pluginProject;

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

import tdt4250.entur.pluginProject.Mapper;


public class Mapping {
	public static String xmiPath =  "../tdt4250.entur.pluginProject/src/data/transportOrg.xmi";
	public static final TransportModelFactory FACTORY = TransportModelFactory.eINSTANCE;

	public static void main(String[] args) throws IOException {
		updateModel();
	}
	
	public static List<operator> createOperator(transportOrg organization) throws IOException {
		List<OperatorClass> operatorList = Mapper.instantiateOperators();
		List<operator> mappedOperators = new ArrayList<operator>();
		operatorList.forEach(operator -> {
			operator op= FACTORY.createoperator();
			op.setId(operator.getId());
			op.setName(operator.getName());
			op.setPhone(operator.getNumber());
			op.setUrl(operator.getUrl());
			mappedOperators.add(op);
			//System.out.println(mappedOperators);
		});
		return mappedOperators;
	}
	
//	public static List<lines> createLines(transportOrg organization) throws IOException {
//		List<LinesClass> linesList = Mapper.instantiateLines();
//		List<lines> mappedLines = new ArrayList<lines>();
//		linesList.forEach(lines -> {
//			lines line= FACTORY.createlines();
//			line.setId(lines.getId());
//			line.setName(lines.getName());
//			line.setTransportMode(lines.getTransportMode());
//			line.setBikesAllowed(lines.getBikesAllowed());
//			mappedLines.add(line);
//			//System.out.println(mappedLines);
//		});
//		return mappedLines;
//	}
	
	//set data to model
	public static void updateModel() throws IOException {
		
		//initializing package
		TransportModelPackage.eINSTANCE.eClass(); 
		
		transportOrg organization = FACTORY.createtransportOrg();
		organization.setName("Entur");	
		
		//List<lines> mappedLines = createLines(organization);
		
		List<operator> mappedOperators = createOperator(organization);
		organization.getHasOperator().addAll(mappedOperators);
		//System.out.println(mappedOperators);
		
		
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
