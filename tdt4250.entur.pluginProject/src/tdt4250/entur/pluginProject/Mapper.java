package tdt4250.entur.pluginProject;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.OperatorClass;

public class Mapper {
	
	private static String jsonpath1 = "../tdt4250.entur.pluginProject/src/data/OperatorsData.json";
	private static String jsonpath2 = "../tdt4250.entur.pluginProject/src/data/LinesData.json";
	private static String jsonpath3 = "../tdt4250.entur.pluginProject/src/data/SpecificLineData.json";
	
	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());

		//Read from json file and convert content to json string 
		Resource resourceTest = resourceSet.createResource(URI.createFileURI(jsonpath1));
			resourceTest.load(null);
			
//		//Create ObjectMapper instance
//		ObjectMapper objmapper = new ObjectMapper();
//		
//		//Create new instances of operators
//		ArrayList<OperatorClass> operatorList = new ArrayList<OperatorClass>();
//		JsonNode treeNode = objmapper.readTree(Paths.get(jsonpath1).toFile());
//		treeNode=treeNode.findValue("operators");
//		OperatorClass operator = new OperatorClass();
//		for (Iterator<JsonNode> it = treeNode.elements(); it.hasNext(); ) {
//			ArrayList<JsonNode> listOfLines = new ArrayList<JsonNode>();
//		   JsonNode node = it.next();
//		   //System.out.println(node);
//		   operator.setId(node.findValue("id").textValue());
//		   operator.setName(node.findValue("name").textValue());
//		   operator.setNumber(node.findValue("phone").textValue());
//		   operator.setUrl(node.findValue("url").textValue());
//		   operator.setLines(node.get("lines"));
//		   for (JsonNode element: node.get("lines")) {
//			   listOfLines.add(element);
//		   }
//		   //System.out.println(operator);  
//		   operatorList.add(operator);
//
//		}
//		System.out.println(operatorList);
	
	}

	public static ArrayList<OperatorClass> instantiateOperators() throws IOException {
		//Create ObjectMapper instance
		ObjectMapper objmapper = new ObjectMapper();
		
		//Create new instances of operators
		ArrayList<OperatorClass> operatorList = new ArrayList<OperatorClass>();
		JsonNode treeNode = objmapper.readTree(Paths.get(jsonpath1).toFile());
		treeNode=treeNode.findValue("operators");
		for (Iterator<JsonNode> it = treeNode.elements(); it.hasNext(); ) {
			ArrayList<JsonNode> listOfLines = new ArrayList<JsonNode>();
			OperatorClass operator = new OperatorClass();
		   JsonNode node = it.next();
		   operator.setId(node.findValue("id").textValue());
		   operator.setName(node.findValue("name").textValue());
		   operator.setNumber(node.findValue("phone").textValue());
		   operator.setUrl(node.findValue("url").textValue());
		   operator.setLines(node.get("lines"));
		   for (JsonNode element: node.get("lines")) {
			   listOfLines.add(element);
		   } 
		   operatorList.add(operator);
		}
		//System.out.println(operatorList);
		return operatorList;
	}

}

