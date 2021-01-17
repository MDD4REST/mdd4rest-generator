package com.github.icelyframework.generator.ontology.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import com.github.icelyframework.generator.ontology.handlers.ExportActivityStormingToOntologyHandler;
import com.github.icelyframework.generator.ontology.handlers.LinkOntologiesHandler;
import com.github.icelyframework.generator.ontology.handlers.OntologyToYamlHandler;
import com.github.icelyframework.generator.ontology.api.DynamicOntologyAPI;
import com.github.icelyframework.generator.ontology.api.LinkedOntologyAPI;
import com.github.icelyframework.generator.ontology.api.StaticOntologyAPI;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Aggregates;

public class OutputGenerator {

	LinkedOntologyAPI linkedOntology;

	private String projectName;
	private String projectPath;
 
	public OutputGenerator(String projectName, String projectPath) {
		this.projectName = projectName;
		this.projectPath = projectPath;
	}
	
	public void dynamicOntologyGenerator() {
		System.out.println();
		System.out.println("***************************");
		System.out.println("PARSE DYNAMIC METAMODEL");
		System.out.println();
		ExportActivityStormingToOntologyHandler acdToDynamicOntoHandler = new ExportActivityStormingToOntologyHandler(
				projectName, projectPath);
		DynamicOntologyAPI dynamicOntology = acdToDynamicOntoHandler.instantiateOntology();
		dynamicOntology.close();
		System.out.println("EXPORT DYNAMIC ONTOLOGY");
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
		DynamicOntologyAPI dynamicOntology = new DynamicOntologyAPI(projectName, projectPath, false);
		
		System.out.println("EXPORT DYNAMIC ONTOLOGY");

		// Create a new file for the linked ontology and instantiate it
		System.out.println("GENERATE LINKED ONTOLOGY");
		linkedOntology = new LinkedOntologyAPI(projectName, projectPath);

		// Link the ontologies
		new LinkOntologiesHandler().linkOntologies(staticOntology, dynamicOntology, linkedOntology);
		System.out.println(linkedOntology);

		// Close the linked ontology. The other two ontologies are not closed since they
		// do not need to be saved.
		linkedOntology.close();
	}

	public void yamlGenerator() {
		linkedOntology = new LinkedOntologyAPI(projectName, projectPath, false);
		new OntologyToYamlHandler(projectName, projectPath, linkedOntology).linkedToYaml();
	}

}
