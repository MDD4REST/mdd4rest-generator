package core.ontology;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.jena.ext.com.google.common.io.ByteStreams;
import org.apache.jena.ontology.*;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.*;
import org.apache.jena.util.iterator.ExtendedIterator;

import core.ontology.OntologySource.OntologyType;

/**
 * Provides an API for an ontology in OWL format. Allows adding/deleting
 * instances and properties.
 * 
 * @author amirdeljouyi
 */
public class OntologyJenaAPI {

	/** The file where the ontology resides. */
	private File file;

	/** Test file used for ontology tests. */
	private File testfile;

	/** The namespace of the ontology. */
	private String NS;

	/** The base URI of the ontology. */
	private OntModel base;

	/** The type of the ontology. */
	private OntologyType ontologyType;

	/** The output path of cim */
	public final String OutputPath = "resources/examples/";

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this
	 * function, the ontology is loaded in memory. <u><b>NOTE</b></u> that you have
	 * to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project      the project to connect the ontology to.
	 * @param ontologyType the type of the ontology.
	 * @param source       the source URI of the ontology.
	 * @param forceDelete  boolean denoting whether any existing ontology file
	 *                     should be deleted.
	 */
	public OntologyJenaAPI(String projectPath, OntologyType ontologyType, String source, String projectName,
			boolean forceDelete) {
		this.ontologyType = ontologyType;

		if (projectPath == null) {
			testfile = new File(OutputPath + projectName + "/" + getFilenameForOntologyType(ontologyType));
			System.out.println("path: " + testfile.getAbsolutePath());
		}
		else {
			file = getPathOfOntologyFile(projectPath, ontologyType);
			System.out.println("path: " + file.getAbsolutePath());
		}

		System.out.println("ontology type: " + getFilenameForOntologyType(ontologyType));
		NS = source + "#";

		if (forceDelete) {
			if (file != null && file.exists()) {
				try {
					file.delete();
					InputStream ontologyStream = OntologySource.getOntology(ontologyType);
					OutputStream output = new FileOutputStream(file);
					ByteStreams.copy(ontologyStream, output);
				} catch (IOException e) {
					System.out.println("Unable to force delete and recreate " + ontologyType.name().toLowerCase()
							+ " ontology file" + e);
				}
			} else if (testfile != null && testfile.exists()) {
				try {
					testfile.delete();
					InputStream ontologyStream = OntologySource.getOntology(ontologyType);
					OutputStream output = new FileOutputStream(testfile);
					ByteStreams.copy(ontologyStream, output);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		initialize();
	}

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this
	 * function, the ontology is loaded in memory. <u><b>NOTE</b></u> that you have
	 * to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project      the project to connect the ontology to.
	 * @param ontologyType the type of the ontology.
	 * @param source       the source URI of the ontology.
	 */
	public OntologyJenaAPI(String projectPath, OntologyType ontologyType, String source) {
		this(projectPath, ontologyType, source, "MyCore", false);
	}

	/**
	 * 
	 * @param ontologyType
	 * @param source
	 */
	public OntologyJenaAPI(String projectPath, OntologyType ontologyType, String source, String projectName) {
		this(projectPath, ontologyType, source, projectName, false);
	}

	/**
	 * Returns the ontology file, in the given project, or in the workspace if the
	 * project is null.
	 * 
	 * @param project      the project to connect the ontology to.
	 * @param ontologyType the type of the ontology.
	 * @return the ontology file.
	 */
	private File getPathOfOntologyFile(String projectPath, OntologyType ontologyType) {
		File file = null;
		String filename = getFilenameForOntologyType(ontologyType);
		if (projectPath != null) {
			if (filename != null) {
				System.out.println("Path");
				filename = projectPath + "/CIM/ontology/" + filename;
				file = new File(filename);
			}
		} else {
			if (filename != null) {
				filename = "resources/examples/example" + filename;
				file = new File(filename);
			}
		}
		return file;
	}

	/**
	 * Returns the filename for an ontology type.
	 * 
	 * @param ontologyType the type of the ontology.
	 * @return the ontology filename.
	 */
	public static String getFilenameForOntologyType(OntologyType ontologyType) {
		String filename = null;
		switch (ontologyType) {
		case STATIC:
			filename = "StaticOntology.owl";
			break;
		case DYNAMIC:
			filename = "DynamicOntology.owl";
			break;
		case LINKED:
			filename = "LinkedOntology.owl";
			break;
		default:
			filename = null;
			break;
		}
		return filename;
	}

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this
	 * function, the ontology is loaded in memory. <u><b>NOTE</b></u> that you have
	 * to call {@link #close()} in order to save your changes to disk.
	 */
	private void initialize() {
		base = ModelFactory.createOntologyModel();
		if (file != null) {
			if (!file.exists()) {
				InputStream ontologyStream = OntologySource.getOntology(ontologyType);
				try {
					OutputStream output = new FileOutputStream(file);
					ByteStreams.copy(ontologyStream, output);
				} catch (IOException e) {
					System.out.println(
							"Unable to create new " + ontologyType.name().toLowerCase() + " ontology file" + e);
				}
			}
			try {
				InputStream in = new FileInputStream(file);
				base.read(in, null);
			} catch (IOException e) {
				System.out
						.println("Unable to read created " + ontologyType.name().toLowerCase() + " ontology file" + e);
			}
		}

		if (testfile != null) {
			if (!testfile.exists()) {
				InputStream ontologyStream = OntologySource.getOntology(ontologyType);
				try {
					OutputStream output = new FileOutputStream(testfile);
					ByteStreams.copy(ontologyStream, output);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				InputStream in = new FileInputStream(testfile);
				base.read(in, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Adds the namespace prefix to an instance string.
	 * 
	 * @param instance the string name of the instance.
	 * @return the instance string with the namespace.
	 */
	private String addNamespaceToInstance(String instance) {
		if (!instance.contains(NS))
			instance = NS + instance.replaceAll("[^A-Za-z0-9]", "_");
		return instance;
	}

	/**
	 * Adds a new individual in the ontology.
	 * 
	 * @param className      the OWL class that the new individual shall exist.
	 * @param individualName the name of the new individual to be added.
	 */
	public void addIndividual(String className, String individualName) {
		OntClass ontClass = base.getOntClass(addNamespaceToInstance(className));
		base.createIndividual(addNamespaceToInstance(individualName), ontClass);
	}

	/**
	 * Adds a new individual in the ontology including a comment.
	 * 
	 * @param className      the OWL class that the new individual shall exist.
	 * @param individualName the name of the new individual to be added.
	 * @param commentText    the text of the comment to be added.
	 */
	public void addIndividual(String className, String individualName, String commentText) {
		OntClass ontClass = base.getOntClass(addNamespaceToInstance(className));
		if (commentText != null && !commentText.equals(""))
			base.createIndividual(addNamespaceToInstance(individualName), ontClass).addComment(commentText, null);
		else
			base.createIndividual(addNamespaceToInstance(individualName), ontClass);
	}

	/**
	 * Removes an individual of the ontology given its name. Note that this method
	 * removes also all the statements that refer to this individual.
	 * 
	 * @param individualName the name of the individual to be deleted.
	 */
	public void removeIndividual(String individualName) {
		getIndividual(individualName).remove();
	}

	/**
	 * Removes a property of a specific individual.
	 * 
	 * @param individualName the name of the individual of which the property is
	 *                       removed
	 * @param propertyName   the name of the property of which the value is removed.
	 */
	public void removePropertyFromIndividual(String individualName, String propertyName) {
		(getIndividual(individualName).getProperty(getProperty(propertyName))).remove();
	}

	/**
	 * Removes all the individuals that connect to an individual given a specific
	 * property.
	 * 
	 * @param individualName the individual to which the individuals to be removed
	 *                       are connected.
	 * @param propertyName   the name of the property that connects the individual
	 *                       with the individuals to be removed.
	 */
	public void removeIndividualsGivenIndividualAndProperty(String individualName, String propertyName) {
		Individual individual = getIndividual(individualName);
		Property property = getProperty(propertyName);
		ArrayList<Individual> individuals = new ArrayList<Individual>();
		for (NodeIterator propertiesIterator = individual.listPropertyValues(property); propertiesIterator.hasNext();)
			individuals.add(getIndividual(propertiesIterator.next().toString()));
		for (Iterator<Individual> individualIterator = individuals.iterator(); individualIterator.hasNext();)
			((Individual) individualIterator.next()).remove();
	}

	/**
	 * Returns an individual given its name.
	 * 
	 * @param individualName the name of the individual to be returned.
	 * @return the existing individual.
	 */
	private Individual getIndividual(String individualName) {
		return base.getIndividual(addNamespaceToInstance(individualName));
	}

	/**
	 * Returns the comment of an individual given its name.
	 * 
	 * @param individualName the name of the individual of which the comment is
	 *                       returned.
	 * @return the comment of the given individual.
	 */
	public String getIndividualComment(String individualName) {
		return base.getIndividual(addNamespaceToInstance(individualName)).getComment(null);
	}

	/**
	 * Returns an ontology property class given its name.
	 * 
	 * @param className the name of the class to be returned.
	 * @return the existing class object.
	 */
	private OntClass getClass(String className) {
		return base.getOntClass(addNamespaceToInstance(className));
	}

	/**
	 * Returns the names of the individuals that belong to the given class
	 * ({@code className}).
	 * 
	 * @param className the name of the class that individuals belong to.
	 * @return an {@link ArrayList} containing the individual names.
	 */
	public ArrayList<String> getIndividualsOfClass(String className) {
		OntClass ontClass = getClass(className);

		ArrayList<String> individualNames = new ArrayList<String>();
		for (ExtendedIterator<? extends OntResource> individualsIterator = ontClass.listInstances(); individualsIterator
				.hasNext();)
			individualNames.add(((OntResource) individualsIterator.next()).getLocalName());
		return individualNames;
	}

	/**
	 * Returns a property given its name.
	 * 
	 * @param propertyName the name of the property to be returned.
	 * @return the existing property.
	 */
	private Property getProperty(String propertyName) {
		return base.getProperty(addNamespaceToInstance(propertyName));
	}

	/**
	 * Returns the inverse property of a property given its name.
	 * 
	 * @param propertyName the name of the property of which the inverse is
	 *                     returned.
	 * @return the inverse property object or {@code null} if it does not exist.
	 */
	private Property getInverseProperty(String propertyName) {
		if (base.getOntProperty(addNamespaceToInstance(propertyName)).hasInverse())
			return base.getOntProperty(addNamespaceToInstance(propertyName)).getInverse();
		else
			return null;
	}

	/**
	 * Connects two individuals using a property.
	 * 
	 * @param individualName1 the first individual from which the property starts.
	 * @param propertyName    the name of the property to connect the two
	 *                        individuals.
	 * @param individualName2 the second individual to which the property ends up.
	 */
	public void addPropertyBetweenIndividuals(String individualName1, String propertyName, String individualName2) {
		Property property = getProperty(propertyName);
		Individual individual1 = getIndividual(individualName1);
		Individual individual2 = getIndividual(individualName2);
		Statement stm = base.createStatement(individual1, property, individual2);
		base.add(stm);
	}

	/**
	 * Connects two individuals using a property, while also declaring the inverse
	 * property.
	 * 
	 * @param individualName1 the first individual from which the property starts.
	 * @param propertyName    the name of the property to connect the two
	 *                        individuals.
	 * @param individualName2 the second individual to which the property ends up.
	 */
	public void addPropertyAndReverseBetweenIndividuals(String individualName1, String propertyName,
			String individualName2) {
		Property property = getProperty(propertyName);
		Individual individual1 = getIndividual(individualName1);
		Individual individual2 = getIndividual(individualName2);
		Statement stm = base.createStatement(individual1, property, individual2);
		base.add(stm);
		Property inverseProperty = getInverseProperty(propertyName);
		if (inverseProperty != null)
			base.add(base.createStatement(individual2, inverseProperty, individual1));
	}

	/**
	 * Adds a property value to a property of an individual.
	 * 
	 * @param individualName the name of the individual.
	 * @param propertyName   the name of the property to add the value to.
	 * @param propertyValue  the value of the property to be added.
	 */
	public void addPropertyToIndividual(String individualName, String propertyName, String propertyValue) {
		Property property = getProperty(propertyName);
		Individual individual = getIndividual(individualName);
		Statement stm = base.createStatement(individual, property, propertyValue);
		base.add(stm);
	}

	/**
	 * Adds a float property value to a property of an individual.
	 * 
	 * @param individualName the name of the individual.
	 * @param propertyName   the name of the property to add the value to.
	 * @param propertyValue  the float value of the property to be added.
	 */
	public void addPropertyToIndividual(String individualName, String propertyName, float propertyValue) {
		Property property = getProperty(propertyName);
		Individual individual = getIndividual(individualName);
		Statement stm = base.createLiteralStatement(individual, property, propertyValue);
		base.add(stm);
	}

	/**
	 * Adds a boolean property value to a property of an individual.
	 * 
	 * @param individualName the name of the individual.
	 * @param propertyName   the name of the property to add the value to.
	 * @param propertyValue  the boolean value of the property to be added.
	 */
	public void addPropertyToIndividual(String individualName, String propertyName, boolean propertyValue) {
		Property property = getProperty(propertyName);
		Individual individual = getIndividual(individualName);
		Statement stm = base.createLiteralStatement(individual, property, propertyValue);
		base.add(stm);
	}

	/**
	 * Returns the names of the individuals that connect to the given individual
	 * ({@code individualName}) via the property given as parameter
	 * ({@code propertyName}).
	 * 
	 * @param individualName the name of the individual of which to find the
	 *                       connected individuals to.
	 * @param propertyName   the property that connects the given individual to the
	 *                       returned individual names.
	 * @return an {@link ArrayList} containing the individual names.
	 */
	public ArrayList<String> getIndividualNamesGivenIndividualAndProperty(String individualName, String propertyName) {
		Individual individual = getIndividual(individualName);
		Property property = getProperty(propertyName);
		ArrayList<String> individualNames = new ArrayList<String>();
		for (NodeIterator individualsIterator = individual.listPropertyValues(property); individualsIterator.hasNext();)
			individualNames.add(((OntResource) individualsIterator.next()).getLocalName());
		return individualNames;
	}

	/**
	 * Returns the names of the first individual that connects to the given
	 * individual ({@code individualName}) via the property given as parameter
	 * ({@code propertyName}).
	 * 
	 * @param individualName the name of the individual of which to find the
	 *                       connected individual to.
	 * @param propertyName   the property that connects the given individual to the
	 *                       returned individual names.
	 * @return the name of the first connected individual.
	 */
	public String getIndividualNameGivenIndividualAndProperty(String individualName, String propertyName) {
		Individual individual = getIndividual(individualName);
		Property property = getProperty(propertyName);
		for (NodeIterator individualsIterator = individual.listPropertyValues(property); individualsIterator.hasNext();)
			return ((OntResource) individualsIterator.next()).getLocalName();
		return null;
	}

	/**
	 * Returns the value of the property of an individual given its name and the
	 * name of the property.
	 * 
	 * @param individualName the name of the individual of which the property value
	 *                       is returned,
	 * @param propertyName   the name of the property of which the value is
	 *                       returned,
	 * @return the returned property value.
	 */
	public String getIndividualPropertyValue(String individualName, String propertyName) {
		Individual individual = getIndividual(individualName);
		Property property = getProperty(propertyName);
		if (individual != null && individual.getPropertyValue(property) != null) {
			if (individual.getPropertyValue(property).toString().startsWith("true^^"))
				return "true";
			else if (individual.getPropertyValue(property).toString().startsWith("false^^"))
				return "false";
			else if (individual.getPropertyValue(property).toString().contains("#"))
				return individual.getPropertyValue(property).toString().split("#")[1];
			else
				return individual.getPropertyValue(property).toString();
		} else
			return null;
	}

	/**
	 * Returns the values of the property of an individual given its name and the
	 * name of the property.
	 * 
	 * @param individualName the name of the individual of which the property value
	 *                       is returned,
	 * @param propertyName   the name of the property of which the value is
	 *                       returned,
	 * @return a list containing the returned property values.
	 */
	public ArrayList<String> getIndividualPropertyValues(String individualName, String propertyName) {
		ArrayList<String> result = new ArrayList<String>();
		Individual individual = getIndividual(individualName);
		Property property = getProperty(propertyName);
		if (individual != null && individual.getPropertyValue(property) != null) {
			StmtIterator valuesIterator = individual.listProperties(property);
			while (valuesIterator.hasNext())
				result.add(valuesIterator.next().getString());
		}
		return result;
	}

	/**
	 * Returns the values of the properties of an individual given its name and the
	 * names of the properties.
	 * 
	 * @param individualName the name of the individual of which the properties
	 *                       values are returned,
	 * @param propertyNames  the names of the properties of which the values are
	 *                       returned,
	 * @return a list containing the returned properties values.
	 */
	public String[] getIndividualPropertiesValues(String individualName, String... propertyNames) {
		String[] values = new String[propertyNames.length];
		for (int i = 0; i < propertyNames.length; i++)
			values[i] = getIndividualPropertyValue(individualName, propertyNames[i]);
		return values;
	}

	/**
	 * Performs a query on the ontology. The query is a string given in SPARQL
	 * format.
	 * 
	 * @param queryString the query string in SPARQL format.
	 * @return an object of type {@link com.hp.hpl.jena.query.ResultSet ResultSet}
	 *         that contains the results.
	 */
	public ResultSet performQuery(String queryString) {
		Query query = QueryFactory.create(queryString);
		QueryExecution queryExecution = QueryExecutionFactory.create(query, base);
		ResultSet results = queryExecution.execSelect();
		return results;
	}

	/**
	 * Closes the connection of the ontology and saves it to disk.
	 * <u><b>NOTE</b></u> that if this function is not called, then the ontology is
	 * not saved.
	 */
	public void close() {
		FileOutputStream out = null;
		if (testfile != null) {
			try {
				out = new FileOutputStream(testfile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			base.write(out);
		} else {
			ByteArrayOutputStream originalOutputStream = new ByteArrayOutputStream();
			base.write(originalOutputStream);
			byte[] byteArray = originalOutputStream.toByteArray();
			InputStream originalInputStream = new ByteArrayInputStream(byteArray);
			try {
				out = new FileOutputStream(file);
				ByteStreams.copy(originalInputStream, out);
			} catch (IOException e) {
				System.out.println("Unable to save the " + ontologyType.name().toLowerCase() + " ontology file" + e);
			}
		}

	}
}
