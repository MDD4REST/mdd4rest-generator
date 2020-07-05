package mde.inputParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.yaml.snakeyaml.Yaml;

public class YamlInputParser {

	private String strYamlFilePath;
	private Yaml oYamlHandler;
	private InputStream oInputStreamHandler;
	private ArrayList<YamlResource> listOfYamlResources;

	public YamlInputParser(String strYamlFilePath) {

		this.strYamlFilePath = strYamlFilePath;
		this.listOfYamlResources = new ArrayList<YamlResource>();
		oYamlHandler = new Yaml();
		try {
			oInputStreamHandler = new FileInputStream(new File(strYamlFilePath));

//			int i;
//
//			while ((i = oInputStreamHandler.read()) != -1) {
//				System.out.print((char) i);
//			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<YamlResource> parseYamlInputFile() {

		this.listOfYamlResources = (ArrayList<YamlResource>) oYamlHandler.load(oInputStreamHandler);
//		System.out.println(oYamlHandler.load(oInputStreamHandler).toString());
		for (YamlResource oYamlResource : listOfYamlResources) {
			System.out.println(oYamlResource + "\n");
		}
		return this.listOfYamlResources;
	}

}
