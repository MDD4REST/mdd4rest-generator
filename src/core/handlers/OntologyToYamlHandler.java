package core.handlers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;

import core.Activator;
import core.builder.ProjectUtils;
import core.ontology.LinkedOntologyAPI;
import core.ontologytoyamltools.Operation;
import core.ontologytoyamltools.Property;
import core.ontologytoyamltools.Resource;
import core.ontologytoyamltools.Resources;
import core.ontologytoyamltools.Stemmer;
import core.ontologytoyamltools.StringHelpers;
import core.ontologytoyamltools.VerbTypeFinder;

/**
 * Class used to read data from the linked ontology and create a PIM in YAML
 * format.
 * 
 * @author themis
 */
public class OntologyToYamlHandler {

	public Object execute() {
		// Load the ontology
		LinkedOntologyAPI linkedOntology = new LinkedOntologyAPI();
		Resources resources = createResources(linkedOntology);
		writeYamlFile(resources);
		return null;
	}

	/**
	 * Creates the resources for the YAML file given the linked ontology.
	 * 
	 * @param linkedOntology the linked ontology that contains all the elements.
	 * @return a list of resources.
	 */
	private Resources createResources(LinkedOntologyAPI linkedOntology) {
		// Verb type finder determining whether a verb is CRUD
		VerbTypeFinder verbTypeFinder = new VerbTypeFinder();

		// Iterate over all resources
		Resources resources = new Resources();
		for (String resourceName : linkedOntology.getResources()) {
			Resource resource = resources.getResourceByName(
					StringHelpers.underscoreToCamelCase(Stemmer.stemNounConstruct(resourceName)), false,
					linkedOntology.resourceIsExternalService(resourceName));

			// Iterate over each related resource of this resource
			for (String relatedResourceName : linkedOntology.getRelationshipsOfResource(resourceName)) {
				resource.addRelatedResource(StringHelpers.underscoreToCamelCase(Stemmer
						.stemNounConstruct(relatedResourceName)));
			}

			// Iterate over each activity of this resource
			for (String activity : linkedOntology.getActivitiesOfResource(resourceName)) {
				String action = linkedOntology.getActionOfActivity(activity);
				String actiontype = linkedOntology.getActivityTypeOfActivity(activity);
				if (actiontype == null || actiontype.equals("Other")) {
					// Use automatic verb type finder
					String verbtype = verbTypeFinder.getVerbType(action);
					if (verbTypeFinder.getVerbType(action).equals("Other")) {
						// Verb is of type Other
						String stemmedAction = Stemmer.stemVerb(action);
						String algorithmicResourceName = StringHelpers.underscoreToCamelCase(Stemmer
								.stemNounConstruct(resourceName))
								+ stemmedAction.substring(0, 1).toUpperCase()
								+ stemmedAction.substring(1);
						resources.addResourceIfItDoesNotExist(algorithmicResourceName, true);
						resource.addRelatedResource(algorithmicResourceName);
					} else
						// Verb is CRUD
						resource.addCRUDActivity(verbtype);
				} else
					// Verb is CRUD
					resource.addCRUDActivity(actiontype);

				// Iterate over next activities
				for (String next_activity : linkedOntology.getNextActivitiesOfActivity(activity)) {
					String relatedResource = linkedOntology.getResourceOfActivity(next_activity);
					resource.addRelatedResource(StringHelpers.underscoreToCamelCase(Stemmer
							.stemNounConstruct(relatedResource)));
				}
			}

			// Iterate over each property of this resource
			for (String property : linkedOntology.getPropertiesOfResource(resourceName)) {
				resource.addProperty(new Property(StringHelpers.underscoreToCamelCase(Stemmer
						.stemNounConstruct(property))));
			}

			// Add information about external web services
			if (linkedOntology.resourceIsExternalService(resourceName)) {

				// Get the operation of this resource
				String operationName = linkedOntology.getOperationOfResource(resourceName);
				Operation operation = new Operation(operationName, linkedOntology.getOperationElements(operationName));

				// Add query parameters
				for (String parameterName : linkedOntology.getQueryParametersOfOperation(operationName)) {
					LinkedList<String> nonPrimitiveProperties = operation.addQueryParameter(parameterName,
							linkedOntology.getQueryParameterElements(parameterName),
							linkedOntology.getParameterTypeElements(parameterName));
					while (!nonPrimitiveProperties.isEmpty()) {
						String nonPrimitiveProperty = nonPrimitiveProperties.remove();
						nonPrimitiveProperties.addAll(operation.addNonPrimitiveProperty(nonPrimitiveProperty,
								linkedOntology.getQueryParameterElements(nonPrimitiveProperty),
								linkedOntology.getParameterTypeElements(nonPrimitiveProperty)));
					}
				}

				// Add input parameters
				for (String parameterName : linkedOntology.getInputParametersOfOperation(operationName)) {
					LinkedList<String> nonPrimitiveProperties = operation.addInputProperty(parameterName,
							linkedOntology.getInputParameterElements(parameterName),
							linkedOntology.getParameterTypeElements(parameterName));
					while (!nonPrimitiveProperties.isEmpty()) {
						String nonPrimitiveProperty = nonPrimitiveProperties.remove();
						nonPrimitiveProperties.addAll(operation.addNonPrimitiveProperty(nonPrimitiveProperty,
								linkedOntology.getInputParameterElements(nonPrimitiveProperty),
								linkedOntology.getParameterTypeElements(nonPrimitiveProperty)));
					}
				}

				// Add output parameters
				for (String parameterName : linkedOntology.getOutputParametersOfOperation(operationName)) {
					LinkedList<String> nonPrimitiveProperties = operation.addOutputProperty(parameterName,
							linkedOntology.getOutputParameterElements(parameterName),
							linkedOntology.getParameterTypeElements(parameterName));
					while (!nonPrimitiveProperties.isEmpty()) {
						String nonPrimitiveProperty = nonPrimitiveProperties.remove();
						nonPrimitiveProperties.addAll(operation.addNonPrimitiveProperty(nonPrimitiveProperty,
								linkedOntology.getOutputParameterElements(nonPrimitiveProperty),
								linkedOntology.getParameterTypeElements(nonPrimitiveProperty)));
					}
				}

				// Add URI parameters
				for (String parameterName : linkedOntology.getURIParametersOfOperation(operationName)) {
					operation.addURIParameter(parameterName);
				}

				// Add the operation to the resource
				resource.addOperation(operation);
			}
		}
		return resources;
	}

	/**
	 * Writes the YAML file of the project given the list of its resources.
	 * 
	 * @param project the project in which the YAML file is written.
	 * @param resources the resources to be written in the YAML file.
	 */
	private void writeYamlFile(Resources resources) {
		// Open a new YAML file in the project
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("E:\\Software Development\\Programming\\service.yml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Activator.log("can't create a file", e);
		}		

		// Write the resources to file
		String ymlContents = "";
		for (Resource resource : resources) {
			ymlContents += resource.toYAMLString() + "\n\n";
		}
		ByteArrayInputStream ymlStream = new ByteArrayInputStream(ymlContents.getBytes(StandardCharsets.UTF_8));
		System.out.println("yml"+ymlContents);
		try {
			IOUtils.copy(ymlStream,file);
		} catch (IOException e) {
			Activator.log("Unable to create YAML file (service.yml).", e);
		}
	}

	/**
	 * Test function for creating the YAML file from the linked ontology.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {
		LinkedOntologyAPI linkedOntology = new LinkedOntologyAPI("Restmarks", false);
		try {
			System.out.println("resources :"+linkedOntology.getResources());
			Resources resources = new OntologyToYamlHandler().createResources(linkedOntology);
			String ymlContents = "";
			for (Resource resource : resources) {
				ymlContents += resource.toYAMLString() + "\n\n";
			}
			PrintWriter out = new PrintWriter("E:\\Software Development\\Programming\\Restmarks.yaml", StandardCharsets.UTF_8.name());
			System.out.println("yml"+ymlContents);
			out.print(ymlContents);
			out.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
