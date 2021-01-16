package com.github.icelyframework.generator.pim.pimGenerator;

import java.util.ArrayList;

import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.generator.pim.inputParser.YamlAggregate;
import com.github.icelyframework.generator.pim.inputParser.YamlApplication;
import com.github.icelyframework.generator.pim.inputParser.YamlRole;
import com.github.icelyframework.staticview.Project;
import com.github.icelyframework.staticview.StaticviewFactory;

public abstract class APIMProducer {
	protected Project oProjectStatic;
	protected com.github.icelyframework.dynamicview.Project oProjectDynamic;
	protected ArrayList<YamlApplication> listOfYamlApplications;
	protected ArrayList<YamlAggregate> listOfYamlAggregates;
	protected ArrayList<YamlRole> listOfYamlRoles;
	protected StaticviewFactory oStaticviewFactory;
	protected DynamicviewFactory oDynamicPIMFactory;
//	protected SecurityPIMMetamodelFactory oSecurityPIMFactory;
//	protected QueryPIMMetamodelFactory oQueryPIMFactory;
	protected String strProjectName;
	protected String strProjectBasePath;
	
	private void initializePIMProducer() {
		this.oStaticviewFactory = StaticviewFactory.eINSTANCE;
		this.oDynamicPIMFactory = DynamicviewFactory.eINSTANCE;
//		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
//		this.oQueryPIMFactory = QueryPIMMetamodelFactory.eINSTANCE;
		this.oProjectStatic = this.oStaticviewFactory.createProject();
		this.oProjectStatic.setName(this.strProjectName);
		this.oProjectStatic.setBasePath(this.strProjectBasePath);
		this.oProjectDynamic = this.oDynamicPIMFactory.createProject();
		this.oProjectDynamic.setName(this.strProjectName);
		this.oProjectDynamic.setBasePath(this.strProjectBasePath);
	}

	public APIMProducer(ArrayList<YamlApplication> listOfYamlApplications,
			ArrayList<YamlAggregate> listOfYamlAggregates) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlAggregates = listOfYamlAggregates;
		this.listOfYamlRoles = new ArrayList<YamlRole>();
		this.strProjectName = "MyCore";
		this.strProjectBasePath = "resources/examples/MyCore";
		initializePIMProducer();
	}

	public APIMProducer(ArrayList<YamlApplication> listOfYamlApplications,
			ArrayList<YamlAggregate> listOfYamlAggregates, String strProjectName, String strProjectOutputPath) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlAggregates = listOfYamlAggregates;
		this.listOfYamlRoles = new ArrayList<YamlRole>();
		this.strProjectBasePath = strProjectOutputPath;
		this.strProjectName = strProjectName;
		initializePIMProducer();
	}

	public APIMProducer(ArrayList<YamlApplication> listOfYamlApplications,
			ArrayList<YamlAggregate> listOfYamlAggregates,
			ArrayList<YamlRole> listOfRoles) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlAggregates = listOfYamlAggregates;
		this.listOfYamlRoles = listOfRoles;
		this.strProjectName = "MyCore";
		this.strProjectBasePath = "resources/examples/MyCore";
		initializePIMProducer();
	}

	public APIMProducer(ArrayList<YamlApplication> listOfYamlApplications,
			ArrayList<YamlAggregate> listOfYamlAggregates,
			ArrayList<YamlRole> listOfRoles, String strProjectName,
			String strProjectOutputPath) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlAggregates = listOfYamlAggregates;
		this.listOfYamlRoles = listOfRoles;
		this.strProjectName = "MyCore";
		this.strProjectBasePath = "resources/examples/MyCore";
		initializePIMProducer();
	}

	public Project getProjectStatic() {
		return this.oProjectStatic;
	}
	
	public com.github.icelyframework.dynamicview.Project getProjectDynamic() {
		return this.oProjectDynamic;
	}

	public StaticviewFactory getServicePIMFactory() {
		return this.oStaticviewFactory;
	}
	
	public DynamicviewFactory getDynamicPIMFactory() {
		return this.oDynamicPIMFactory;
	}

//	public SecurityPIMMetamodelFactory getSecurityPIMFactory() {
//		return oSecurityPIMFactory;
//	}
//
//	public QueryPIMMetamodelFactory getQueryPIMFactory() {
//		return oQueryPIMFactory;
//	}

	public String getProjectName() {
		return this.strProjectName;
	}

	public abstract Project producePIMStatic();
	
	public abstract com.github.icelyframework.dynamicview.Project producePIMDynamic();
}