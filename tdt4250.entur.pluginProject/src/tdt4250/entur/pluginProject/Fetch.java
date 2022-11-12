package tdt4250.entur.pluginProject;

import java.io.IOException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

public class Fetch {
	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());

		Resource resourceTest = resourceSet.createResource(URI.createFileURI("../tdt4250.entur.pluginProject/src/data/SpecificLineData.json"));
		try {
			resourceTest.load(null);
			System.out.println("Halla");
			//System.out.println(resourceTest.getContents().get(0));
			byte[] jsonData = Files.readAllBytes(Paths.get("../tdt4250.entur.pluginProject/src/data/SpecificLineData.json"));
			System.out.println(jsonData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Resource resource = resourceSet.createResource
//				  (URI.createFileURI("../tdt4250.entur.pluginProject/src/data/SpecificLineData.json"));
//
//				try {
//					resource.load(null);
//					System.out.println(resource.getContents().toString());
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
		
	}

}
//	(URI.createFileURI("/tdt4250.entur.resource/src/data/SpecificLineData.json"));

