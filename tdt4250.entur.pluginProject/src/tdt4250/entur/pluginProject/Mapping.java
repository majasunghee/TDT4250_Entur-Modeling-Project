package tdt4250.entur.pluginProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.databind.JsonNode;

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
	//private static String jsonpath = "../tdt4250.entur.pluginProject/src/data/OperatorsData.json";
	//private static String xmiPath = "/tdt4250.entur.model/model/transportOrg.xmi";
	public static String xmiPath =  "../tdt4250.entur.pluginProject/src/data/transportOrg.xmi";
	public static final TransportModelFactory FACTORY = TransportModelFactory.eINSTANCE;

	public static void main(String[] args) throws IOException {
		updateModel();
		test(null);
	}
	
	public static List<OperatorClass> test(transportOrg organization) throws IOException {
		List<OperatorClass> operatorList = Mapper.instantiateOperators();
		List<OperatorClass> mappedOperators = new ArrayList<OperatorClass>();
		operatorList.forEach(operator -> {
			operator op= FACTORY.createoperator();
			op.setId(operator.getId());
			op.setName(operator.getName());
			//System.out.println(operator.name);
			mappedOperators.add(operator);
			//Fikse modell? transport org har ikke liste med operatører. hasOperator() er en boolean som sier om transport org har operatøer eller ikke.
		});
		return mappedOperators;


	}
	
	//set data to model
	public static void updateModel() throws IOException {
		
		//initializing package
		TransportModelPackage.eINSTANCE.eClass(); 
		
		transportOrg organization = FACTORY.createtransportOrg();
		organization.setName("Entur");	
		
		List<OperatorClass> mappedOperators = test(organization);
		
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
