package fetchData;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
public class Fetch {

	Resource resource = resourceSet.createResource
			  (URI.createFileURI("/tdt4250.entur.resource/src/data/SpecificLineData.json"));

			resource.load(null);
}

