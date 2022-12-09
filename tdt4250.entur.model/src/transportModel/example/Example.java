package transportModel.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import transportModel.TransportModelPackage;

public class Example {
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(TransportModelPackage.eNS_URI, TransportModelPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("transportOrg.xmi").toString()), true);
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			System.out.println(eObject);
		}
	}
}
