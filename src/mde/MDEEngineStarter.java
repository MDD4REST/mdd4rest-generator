package mde;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ServicePIM.RESTfulServicePIM;
import ServicePIM.ServicePIMPackage;
import mde.inputParser.YamlApplication;
import mde.inputParser.YamlEnumeration;
import mde.inputParser.YamlInputParser;
import mde.inputParser.YamlRESTfulService;
import mde.inputParser.YamlResource;
import mde.inputParser.YamlRole;
import mde.pimGenerator.APIMProducer;
import mde.pimGenerator.CorePIMProducer;
import mde.pimGenerator.EcoreXMIExtractor;


public class MDEEngineStarter
{
	private static YamlInputParser oYamlInputParser;
	private static APIMProducer oAPIMProducer;	
	
	public static void main(String[] args)
	{	
		System.out.println("MyCore MDE engine started.");
		
		//check input arguments sanity
		if(args.length < 1)
		{
			System.out.println("Usage: java -cp path project_Name output_path database_ip database_port database_username database_password use_authentication use_searching?");
			return;
		}
		
		//parse the input yaml file
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PARSING YAML INPUT");
		oYamlInputParser = new YamlInputParser(args[0]);
		YamlRESTfulService listOfYaml = oYamlInputParser.parseYamlRESTfulServiceInputFile();
		ArrayList<YamlResource> listOfYamlResources = oYamlInputParser.getListOfYamlResources();
		ArrayList<YamlApplication> listOfYamlApplications = oYamlInputParser.getListOfYamlApplications();
		ArrayList<YamlRole> listOfYamlRoles = oYamlInputParser.getListOfYamlRoles();
		ArrayList<YamlEnumeration> listOfYamlEnumerations = oYamlInputParser.getListOfYamlEnumerations();
		System.out.println("PARSING YAML DONE");
		
		//initiate PIM generator
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PIM DEFINITION START");
		System.out.println("------------------------------------------------------------------------");
		oAPIMProducer = new CorePIMProducer(listOfYamlApplications, listOfYamlResources, listOfYamlRoles, listOfYamlEnumerations);
		RESTfulServicePIM oRESTfulServicePIM = oAPIMProducer.producePIM();
		System.out.println(oRESTfulServicePIM.getHasApplications());
		System.out.println("Created " + oRESTfulServicePIM.getHasApplications().size() + " PIM resources");
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor("bookmarks");
		ServicePIMPackage eINSTANCE = ServicePIM.impl.ServicePIMPackageImpl.init();
//		System.out.println(eINSTANCE.getRESTfulServicePIM());
//		System.out.println(oRESTfulServicePIM.getSe);
		oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServicePIM);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PIM DEFINITION END");
		System.out.println("------------------------------------------------------------------------");
	}
}