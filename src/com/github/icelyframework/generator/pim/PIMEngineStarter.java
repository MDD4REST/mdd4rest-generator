package com.github.icelyframework.generator.pim;

import com.github.icelyframework.staticview.Project;
import com.github.icelyframework.generator.pim.inputParser.YamlInputParser;
import com.github.icelyframework.generator.pim.inputParser.YamlRESTfulService;
import com.github.icelyframework.generator.pim.pimGenerator.APIMProducer;
import com.github.icelyframework.generator.pim.pimGenerator.CorePIMProducer;
import com.github.icelyframework.generator.pim.pimGenerator.EcoreXMIExtractor;


public class PIMEngineStarter
{
	private static YamlInputParser oYamlInputParser;
	private static APIMProducer oAPIMProducer;	
	
	public static void main(String[] args)
	{	
		System.out.println("MyCore MDE engine started.");
		
		//check input arguments sanity
		if(args.length < 3)
		{
			System.out.println("Usage: java -cp project_Name project_path yaml_path?");
			return;
		}
		
		String projectName = args[0];
		String projectPath = args[1];
		String yamlPath = args[2];
		
		//parse the input yaml file
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PARSING YAML INPUT");
		oYamlInputParser = new YamlInputParser(yamlPath);
		YamlRESTfulService listOfYaml = oYamlInputParser.parseYamlRESTfulServiceInputFile();
		System.out.println("PARSING YAML DONE");
		
		//initiate PIM generator
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PIM DEFINITION START");
		System.out.println("------------------------------------------------------------------------");
		oAPIMProducer = new CorePIMProducer(listOfYaml, projectName, projectPath);
		Project oPIMStatic = oAPIMProducer.producePIMStatic();
		com.github.icelyframework.dynamicview.Project oPIMDynamic = oAPIMProducer.producePIMDynamic();
		System.out.println(oPIMStatic.getHasApplication());
		System.out.println("Created " + oPIMStatic.getHasApplication().size() + " PIM Applications");
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(projectName, projectPath);
		oEcoreXMIExtractor.exportStaticEcoreXMI(oPIMStatic);
		oEcoreXMIExtractor.exportDynamicEcoreXMI(oPIMDynamic);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("PIM DEFINITION END");
		System.out.println("------------------------------------------------------------------------");
	}
}