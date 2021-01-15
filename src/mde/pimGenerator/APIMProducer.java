package mde.pimGenerator;

import java.util.ArrayList;

import DynamicPIM.DynamicPIMFactory;
import mde.inputParser.YamlAggregate;
import mde.inputParser.YamlApplication;
import mde.inputParser.YamlRole;
import StaticPIM.Project;
import StaticPIM.StaticPIMFactory;

public abstract class APIMProducer {
	protected Project oProjectStatic;
	protected DynamicPIM.Project oProjectDynamic;
	protected ArrayList<YamlApplication> listOfYamlApplications;
	protected ArrayList<YamlAggregate> listOfYamlAggregates;
	protected ArrayList<YamlRole> listOfYamlRoles;
	protected StaticPIMFactory oStaticPIMFactory;
	protected DynamicPIMFactory oDynamicPIMFactory;
//	protected SecurityPIMMetamodelFactory oSecurityPIMFactory;
//	protected QueryPIMMetamodelFactory oQueryPIMFactory;
	protected String strProjectName;
	protected String strProjectBasePath;
	
	private void initializePIMProducer() {
		this.oStaticPIMFactory = StaticPIMFactory.eINSTANCE;
		this.oDynamicPIMFactory = DynamicPIMFactory.eINSTANCE;
//		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
//		this.oQueryPIMFactory = QueryPIMMetamodelFactory.eINSTANCE;
		this.oProjectStatic = this.oStaticPIMFactory.createProject();
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
	
	public DynamicPIM.Project getProjectDynamic() {
		return this.oProjectDynamic;
	}

	public StaticPIMFactory getServicePIMFactory() {
		return this.oStaticPIMFactory;
	}
	
	public DynamicPIMFactory getDynamicPIMFactory() {
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
	
	public abstract DynamicPIM.Project producePIMDynamic();
}