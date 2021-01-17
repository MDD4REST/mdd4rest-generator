package com.github.icelyframework.generator.mde.runner;

import com.github.icelyframework.generator.mde.inputParser.YamlInputParser;
import com.github.icelyframework.generator.mde.inputParser.YamlRESTfulService;
import com.github.icelyframework.generator.mde.pimGenerator.APIMProducer;
import com.github.icelyframework.generator.mde.pimGenerator.CorePIMProducer;
import com.github.icelyframework.generator.mde.pimGenerator.EcoreXMIExtractor;
import com.github.icelyframework.staticview.Project;

public class OutputGenerator {

    private String projectName;
    private String projectPath;
    private static YamlInputParser oYamlInputParser;
    private static APIMProducer oAPIMProducer;

    public OutputGenerator(String projectName, String projectPath) {
        this.projectName = projectName;
        this.projectPath = projectPath;
    }

    public void pimGenerator(String yamlPath){
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
