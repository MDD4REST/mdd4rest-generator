package mde.inputParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
			oInputStreamHandler = new FileInputStream(new File(strYamlFilePath));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public YamlRESTfulService parseYamlRESTfulServiceInputFile() {
		System.out.println("---------------Parse The Yaml File----------------");
		this.listOfYamls = (YamlRESTfulService) oYamlHandler.load(oInputStreamHandler);
		return this.listOfYamls;
	}
	
	public ArrayList<YamlResource> getListOfYamlResources() {
		for (YamlResource oYamlRespource : this.listOfYamls.getResources()) {
			System.out.println(oYamlRespource + "\n");
		}
		return this.listOfYamls.getResources();
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
	
	public ArrayList<YamlEnumeration> getListOfYamlEnumerations() {

		for (YamlEnumeration oYamlEnumeration : listOfYamls.getEnumerations()) {
			System.out.println(oYamlEnumeration + "\n");
		}
		return this.listOfYamls.getEnumerations();
	}

}
