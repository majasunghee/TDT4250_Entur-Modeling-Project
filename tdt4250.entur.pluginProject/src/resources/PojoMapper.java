package resources;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.LinesClass;
import pojo.OperatorClass;
import pojo.SpecificLineClass;
import transportModel.TransportModeType;

public class PojoMapper {
	
	private static String jsonpath1 = "../tdt4250.entur.pluginProject/src/data/OutputAllOperatorsData.json";
	private static String jsonpath2 = "../tdt4250.entur.pluginProject/src/data/OutputLinesData.json";
	private static String jsonpath3 = "../tdt4250.entur.pluginProject/src/data/OutputSpecificLineData.json";
	
	public static void main(String[] args) throws IOException {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());

		//Read from json files and convert content to json string 
		Resource resource1 = resourceSet.createResource(URI.createFileURI(jsonpath1));
		resource1.load(null);
		
		Resource resource2 = resourceSet.createResource(URI.createFileURI(jsonpath2));
		resource2.load(null);
		instantiateLines();
		
		Resource resource3 = resourceSet.createResource(URI.createFileURI(jsonpath3));
		resource3.load(null);
		instantiateSpecificLines();
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
//		   System.out.println(node);
		   operator.setId(node.findValue("id").textValue());
		   operator.setName(node.findValue("name").textValue());
		   operator.setNumber(node.findValue("phone").textValue());
		   operator.setUrl(node.findValue("url").textValue());
		   operator.setLines(node.get("lines"));
		   for (JsonNode element: node.get("lines")) {
			   listOfLines.add(element);
		   } 
//		   System.out.println(operator); 
		   operatorList.add(operator);
		}
		//System.out.println(operatorList);
		return operatorList;
	}
	
	
	public static ArrayList<LinesClass> instantiateLines() throws IOException {
		//Create ObjectMapper instance
		ObjectMapper objmapper = new ObjectMapper();
		
		//Create new instances of lines
		ArrayList<LinesClass> linesList = new ArrayList<LinesClass>();
		JsonNode treeNode = objmapper.readTree(Paths.get(jsonpath2).toFile());
		treeNode=treeNode.findValue("lines");
		for (Iterator<JsonNode> it = treeNode.elements(); it.hasNext(); ) {
			LinesClass lines = new LinesClass();
		   JsonNode node = it.next();
		   lines.setId(node.findValue("id").textValue());
		   lines.setName(node.findValue("name").textValue());
		   lines.setTransportMode(checkTransportMode(node.findValue("transportMode").textValue()));
		   lines.setBikesAllowed(checkBikesAllowed(node.findValue("bikesAllowed").textValue()));
		   linesList.add(lines);
		}
		//System.out.println(linesList);
		return linesList;
	}
	
	public static TransportModeType checkTransportMode(String transportMode) {
		TransportModeType mode = null;		
		switch(transportMode) {
		  case "bus":
			  mode = TransportModeType.BUS;
		    break;
		  case "air":
			  mode = TransportModeType.AIR;
			break;
		  case "water":
			  mode = TransportModeType.WATER;
			break;
		  case "rail":
			  mode = TransportModeType.RAIL;
			break;  
		  case "lift":
			  mode = TransportModeType.LIFT;
			break;
		}
		return mode;
	};
	
	public static boolean checkBikesAllowed(String bikesAllowed) {
		if (bikesAllowed.contains("allowed")) {
			return true;	
		}
		else {
			return false;
		}
	}

	public static SpecificLineClass instantiateSpecificLines() throws IOException {
		//Create ObjectMapper instance
		ObjectMapper objmapper = new ObjectMapper();
		
		//Create new instance of a specific line
		
		JsonNode treeNode = objmapper.readTree(Paths.get(jsonpath3).toFile());
		treeNode=treeNode.findValue("line");
		//System.out.println(treeNode);
		SpecificLineClass specificLine = new SpecificLineClass();
		specificLine.setSpecificLineId(treeNode.findValue("id").textValue());
		
		treeNode=treeNode.findValue("journeyPatterns");
		ArrayList<ArrayList<String>> routes = new ArrayList<>();
		ArrayList<ArrayList<String>> route = new ArrayList<>();
		for (Iterator<JsonNode> it = treeNode.elements(); it.hasNext(); ) {
		   JsonNode node = it.next();
		   //System.out.println(node);

		   specificLine.setRouteId(node.findValue("id").textValue());
		   specificLine.setRouteName(node.findValue("name").textValue());
//		   System.out.println(specificLine);
//		   
//		   ArrayList<String> stopPlaces = new ArrayList<>();
//		   for (Iterator<JsonNode> stopIt = node.findValue("quays").elements(); stopIt.hasNext(); ) {
//			   JsonNode stopNode = stopIt.next();
//			   stopPlaces.add(stopNode.findValue("name").textValue());
		   }
//		   
//		   ArrayList<String> singlePattern = new ArrayList<>();
//		   ArrayList<ArrayList<String>> journeyPatterns = new ArrayList<>();
//		   for (Iterator<JsonNode> patternIt = node.findValue("journeyPatterns").elements(); patternIt.hasNext(); ) {
//			   JsonNode patternNode = patternIt.next();
//			   singlePattern.add(patternNode.findValue("name").textValue());
//			  
//			   singlePattern.add(patternNode.findValue("directionType").textValue());
//			   journeyPatterns.add(singlePattern);
//		   }
//		   routes.add(stopPlaces);
//		   routes.addAll(journeyPatterns);
//		   specificLine.setJourneyPatterns(routes);;
//		}
		//System.out.print(specificLine);
		return specificLine;
	}
	
}

