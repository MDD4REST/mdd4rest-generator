package core.ontology.tests;

import core.ontology.LinkedOntologyAPI;

/**
 * Tests the instantation of the linked ontology using external service resources.
 * 
 * @author themis
 */
public class LinkedOntologyExternalServiceAPITest {

	/**
	 * Tests the instantation of the linked ontology using external service resources.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {
		String projectName = "GetCurrencyRatesAndEmail";

		// Create a new file for the linked ontology and instantiate it
		LinkedOntologyAPI linkedOntology = new LinkedOntologyAPI(projectName, false);

		// Add a new resource in the linked ontology
		linkedOntology.addResource(projectName + "_Resource", true);
		linkedOntology.connectProjectToElement(projectName + "_Resource");

		// Add a new operation for the resource
		linkedOntology.addOperationToResource(projectName + "_Resource", "GetCurrencyRatesAndEmail",
				"http://109.231.126.106:8080/GetCurrencyRatesAndEmail-0.0.1-SNAPSHOT/", "rest/result/query", "RESTful",
				"GET", "JSON");

		// Add the input parameters of the operation
		linkedOntology.addInputParameter("from", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", false, "string");
		linkedOntology.addInputParameter("subject", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", true, "string");
		linkedOntology.addInputParameter("to", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", false, "string");
		linkedOntology.addInputParameter("text", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", false, "string");
		linkedOntology.addInputParameter("apikey", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", false, "string");
		linkedOntology.addInputParameter("domain", "Primitive", false,
				"https://api:{apikey}@api.mailgun.net/v3/{domain}/messages", false, "string");
		linkedOntology.addInputParameter("access_key", "Primitive", false, "http://apilayer.net/api/live", false,
				"string");
		linkedOntology.addQueryParametersToOperation("GetCurrencyRatesAndEmail", "from", "subject", "to", "text",
				"access_key", "domain", "apikey");

		// Add the output parameters of the operation
		linkedOntology.addOutputParameter("privacy", "Primitive", "string");
		linkedOntology.addOutputParameter("USDEUR", "Primitive", "double");
		linkedOntology.addOutputParameter("USDGBP", "Primitive", "double");
		linkedOntology.addOutputParameter("quotes", "Object", "USDEUR", "USDGBP");
		linkedOntology.addOutputParameter("source", "Primitive", "string");
		linkedOntology.addOutputParameter("terms", "Primitive", "string");
		linkedOntology.addOutputParameter("timestamp", "Primitive", "string");
		linkedOntology.addOutputParameter("id", "Primitive", "string");
		linkedOntology.addOutputParameter("message", "Primitive", "string");
		linkedOntology.addOutputParametersToOperation("GetCurrencyRatesAndEmail", "quotes", "privacy", "source",
				"terms", "timestamp", "id", "message");

		// Close the linked ontology. The other two ontologies are not closed since they do not need to be saved.
		linkedOntology.close();
	}

}
