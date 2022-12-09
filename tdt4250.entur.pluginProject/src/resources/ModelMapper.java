package resources;

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


import pojo.LinesClass;
import pojo.OperatorClass;
import pojo.RoutesInLine;
import transportModel.lines;
import transportModel.operator;
import transportModel.route;
import transportModel.stopPlace;
import transportModel.transportOrg;
import transportModel.TransportModelFactory;
import transportModel.TransportModelPackage;


public class ModelMapper {
	public static String xmiPath =  "../tdt4250.entur.pluginProject/src/data/transportOrg.xmi";
	//public static String xmiSubset =  "../tdt4250.entur.pluginProject/src/data/transportOrgSubset.xmi";
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
	public static List<lines> createLines(transportOrg organization, List<route> routes) throws IOException {
		List<LinesClass> linesList = PojoMapper.instantiateLines();
		List<lines> mappedLines = new ArrayList<lines>();
		linesList.forEach(lines -> {
			lines line= FACTORY.createlines();
			line.setId(lines.getId());
			line.setName(lines.getName());
			line.setTransportMode(lines.getTransportMode());
			line.setBikesAllowed(lines.getBikesAllowed());
			if(line.getId().toString().equals(routes.get(0).getLineID())) {
				line.getRoutes().addAll(routes);
			}
			mappedLines.add(line);
		});
		return mappedLines;
	};

	
	//Sets specificLine data to model
	public static List<route> createRoutesInLine(transportOrg organization) throws IOException {
		RoutesInLine routes = PojoMapper.instantiateRoutesInLines();
		List<route> listOfRoutes = new ArrayList<>();
		for (String routeId: routes.getRoutesInLine().keySet() ) {
			route routeInstance = FACTORY.createroute();
			routeInstance.setLineID(routes.getLineId());
			routeInstance.setId(routeId);
			routeInstance.setName(routeId);
			for (String stopplace: routes.getRoutesInLine().get(routeId)) {
				stopPlace sp = FACTORY.createstopPlace();
				sp.setName(stopplace);
				routeInstance.getStopPlaces().add(sp);
			}
			listOfRoutes.add(routeInstance);
		};
		return listOfRoutes;	
	}
	
	public static void updateModel() throws IOException {
		
		//initializing package
		TransportModelPackage.eINSTANCE.eClass(); 
		
		transportOrg organization = FACTORY.createtransportOrg();
		organization.setName("Entur");	
		
		List<route> routes = createRoutesInLine(organization);
		
		List<lines> mappedLines = createLines(organization, routes);
		
		List<operator> mappedOperators = createOperator(organization, mappedLines);
		organization.getHasOperator().addAll(mappedOperators);		
		
		
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl()); //
				
		
		//creating new resource set
		ResourceSet resourceSet = new ResourceSetImpl();

		//Read from json file and convert content to json string 
		Resource resource = resourceSet.createResource(URI.createFileURI(xmiPath));
		//Resource resource2 = resourceSet.createResource(URI.createFileURI(xmiSubset));
		
	
        resource.getContents().add(organization); 
        //resource2.getContents().add(organization);

		
			try {
				System.out.println("Saved data to xmi file.");
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				System.out.println("Could not save to xmi file.");
				e.printStackTrace();
			}
	}

};
