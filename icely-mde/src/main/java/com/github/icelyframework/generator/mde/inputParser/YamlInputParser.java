package com.github.icelyframework.generator.mde.inputParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class YamlInputParser {

	private String strYamlFilePath;
	private Yaml oYamlHandler;
	private InputStream oInputStreamHandler;
	private YamlRESTfulService listOfYamls;
	
	public YamlInputParser(String strYamlFilePath) {

		this.strYamlFilePath = strYamlFilePath;
		oYamlHandler = new Yaml(new Constructor(YamlRESTfulService.class));
		try {
			String currentDirectory = System.getProperty("user.dir");
			oInputStreamHandler = new FileInputStream(new File(this.strYamlFilePath));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public YamlRESTfulService parseYamlRESTfulServiceInputFile() {
		System.out.println("---------------Parse The Yaml File----------------");
		this.listOfYamls = (YamlRESTfulService) oYamlHandler.load(oInputStreamHandler);
		return this.listOfYamls;
	}
	
	public ArrayList<YamlAggregate> getListOfYamlAggregates() {
		for (YamlAggregate oYamlAggregates : this.listOfYamls.getAggregates()) {
			System.out.println(oYamlAggregates + "\n");
		}
		return this.listOfYamls.getAggregates();
	}
	
	public ArrayList<YamlApplication> getListOfYamlApplications() {

		for (YamlApplication oYamlApplication : this.listOfYamls.getApplications()) {
			System.out.println(oYamlApplication + "\n");
		}
		return this.listOfYamls.getApplications();
	}
	
	public ArrayList<YamlRole> getListOfYamlRoles() {

		for (YamlRole oYamlRole : listOfYamls.getRoles()) {
			System.out.println(oYamlRole + "\n");
		}
		return this.listOfYamls.getRoles();
	}

}
