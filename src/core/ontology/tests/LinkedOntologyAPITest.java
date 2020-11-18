package core.ontology.tests;

import core.handlers.LinkOntologiesHandler;
import core.ontology.DynamicOntologyAPI;
import core.ontology.LinkedOntologyAPI;
import core.ontology.StaticOntologyAPI;

/**
 * Links the static and the dynamic ontologies into one linked ontology.
 * 
 * @author themis
 */
public class LinkedOntologyAPITest {

	/**
	 * Links the static and the dynamic ontologies. The ontologies are read and combined in a new ontology.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {
		String projectName = "Restmarks";

		// Load the two ontologies
		StaticOntologyAPI staticOntology = new StaticOntologyAPI(projectName, "resources/examples/bookmarks", false);
		DynamicOntologyAPI dynamicOntology = new DynamicOntologyAPI(projectName, "resources/examples/bookmarks", false);

		// Create a new file for the linked ontology and instantiate it
		LinkedOntologyAPI linkedOntology = new LinkedOntologyAPI(projectName, "resources/examples/bookmarks");

		// Link the ontologies
		new LinkOntologiesHandler().linkOntologies(staticOntology, dynamicOntology, linkedOntology);
		System.out.println(linkedOntology);

		// Close the linked ontology. The other two ontologies are not closed since they do not need to be saved.
		linkedOntology.close();
	}

}
