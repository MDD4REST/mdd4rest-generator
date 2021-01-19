package com.github.icelyframework.generator.mde;

import com.github.icelyframework.generator.mde.runner.OutputGenerator;
import com.github.icelyframework.staticview.Project;
import com.github.icelyframework.generator.mde.inputParser.YamlInputParser;
import com.github.icelyframework.generator.mde.inputParser.YamlRESTfulService;
import com.github.icelyframework.generator.mde.pimGenerator.APIMProducer;
import com.github.icelyframework.generator.mde.pimGenerator.CorePIMProducer;
import com.github.icelyframework.generator.mde.pimGenerator.EcoreXMIExtractor;


public class MDEEngineStarter
{
	
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

		OutputGenerator outputGenerator = new OutputGenerator(projectName,projectPath);
		outputGenerator.pimGenerator(yamlPath);
	}
}