package mde.pimGenerator;

import java.util.ArrayList;

import QueryPIM.QueryPIMMetamodelFactory;
import mde.inputParser.YamlApplication;
import mde.inputParser.YamlEnumeration;
import mde.inputParser.YamlResource;
import mde.inputParser.YamlRole;
import ServicePIM.ServicePIMFactory;
import SecurityPIM.SecurityPIMMetamodelFactory;
import ServicePIM.RESTfulServicePIM;

public abstract class APIMProducer {
	protected RESTfulServicePIM oRESTfulServicePIM;
	protected ArrayList<YamlApplication> listOfYamlApplications;
	protected ArrayList<YamlResource> listOfYamlResources;
	protected ArrayList<YamlRole> listOfYamlRoles;
	protected ArrayList<YamlEnumeration> listOfYamlEnumerations;
	protected ServicePIMFactory oServicePIMFactory;
	protected SecurityPIMMetamodelFactory oSecurityPIMFactory;
	protected QueryPIMMetamodelFactory oQueryPIMFactory;
	protected String strProjectName;
	protected String strProjectBasePath;

	public APIMProducer(
			ArrayList<YamlApplication> listOfYamlApplications,
			ArrayList<YamlResource> listofYamlResources,
			ArrayList<YamlRole> listOfRoles,
			ArrayList<YamlEnumeration> listOfEnumerations
		) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlResources = listofYamlResources;
		this.listOfYamlRoles = listOfRoles;
		this.listOfYamlEnumerations = listOfEnumerations;
		this.oServicePIMFactory = ServicePIMFactory.eINSTANCE;
		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
		this.oQueryPIMFactory = QueryPIMMetamodelFactory.eINSTANCE;
		this.strProjectName = "Amir Project";
		this.oRESTfulServicePIM = this.oServicePIMFactory.createRESTfulServicePIM();
		this.oRESTfulServicePIM.setName(strProjectName);
		this.oRESTfulServicePIM.setBasePath("");

	}

	public APIMProducer(ArrayList<YamlApplication> listOfYamlApplications, ArrayList<YamlResource> listofYamlResources,
			ArrayList<YamlRole> listOfRoles, ArrayList<YamlEnumeration> listOfEnumerations, String strProjectName,
			String strProjectOutputPath) {
		this.listOfYamlApplications = listOfYamlApplications;
		this.listOfYamlResources = listofYamlResources;
		this.listOfYamlRoles = listOfRoles;
		this.listOfYamlEnumerations = listOfEnumerations;
		this.oServicePIMFactory = ServicePIMFactory.eINSTANCE;
		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
		this.oQueryPIMFactory = QueryPIMMetamodelFactory.eINSTANCE;
		this.strProjectName = strProjectName;
		this.oRESTfulServicePIM = this.oServicePIMFactory.createRESTfulServicePIM();
		this.oRESTfulServicePIM.setName(strProjectName);
		this.oRESTfulServicePIM.setBasePath(strProjectOutputPath);
	}

	public RESTfulServicePIM getRESTfulServicePIM() {
		return this.oRESTfulServicePIM;
	}

	public ServicePIMFactory getServicePIMFactory() {
		return this.oServicePIMFactory;
	}

	public SecurityPIMMetamodelFactory getSecurityPIMFactory() {
		return oSecurityPIMFactory;
	}

	public QueryPIMMetamodelFactory getQueryPIMFactory() {
		return oQueryPIMFactory;
	}

	public String getProjectName() {
		return this.strProjectName;
	}

	public abstract RESTfulServicePIM producePIM();
}