package core.run;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ActivityDiagramMetamodel.ActivityDiagram;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import core.handlers.ExportActivityDiagramMetamodelToOntologyHandler;
import core.handlers.LinkOntologiesHandler;
import core.ontology.DynamicOntologyAPI;
import core.ontology.LinkedOntologyAPI;
import core.ontology.StaticOntologyAPI;

public class OutputGenerator {

	private String projectName;
	private String projectPath;

	public OutputGenerator(String projectName, String projectPath) {
		this.projectName = projectName;
		this.projectPath = projectPath;
	}

	public void linkedOntolotyGenerator() {
		// parse the input yaml file
		System.out.println("***************************");
		System.out.println("LOAD STATIC ONTOLOGY");
		System.out.println();
		StaticOntologyAPI staticOntology = new StaticOntologyAPI(projectName, projectPath, false);
		
		System.out.println();
		System.out.println("***************************");
		System.out.println("PARSE DYNAMIC METAMODEL");
		System.out.println();
		ExportActivityDiagramMetamodelToOntologyHandler acdToDynamicOntoHandler = new ExportActivityDiagramMetamodelToOntologyHandler(projectName, projectPath);
		DynamicOntologyAPI dynamicOntology = acdToDynamicOntoHandler.instantiateOntology();

		System.out.println("EXPORT DYNAMIC ONTOLOGY");

		// Create a new file for the linked ontology and instantiate it
		System.out.println("GENERATE LINKED ONTOLOGY");
		LinkedOntologyAPI linkedOntology = new LinkedOntologyAPI(projectName, projectPath);

		// Link the ontologies
		new LinkOntologiesHandler().linkOntologies(staticOntology, dynamicOntology, linkedOntology);
		System.out.println(linkedOntology);

		// Close the linked ontology. The other two ontologies are not closed since they
		// do not need to be saved.
		linkedOntology.close();
	}

	public void yamlGenerator() {

	}

}
