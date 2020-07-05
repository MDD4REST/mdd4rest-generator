/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2014
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : S-CASE
 * WorkFile            : 
 * Compiler            : 
 * File Description    :
 * Document Description:
* Related Documents	   :
* Note				   :
* Programmer		   : Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/

package mde.pimGenerator;

import java.util.ArrayList;

import mde.inputParser.YamlResource;
import ServicePIM.ServicePIMFactory;
import ServicePIM.RESTfulServicePIM;

public abstract class APIMProducer
{
	protected RESTfulServicePIM oRESTfulServicePIM;
	protected ArrayList<YamlResource> listOfYamlResources;
	protected ServicePIMFactory oRestServicePIMFactory;
	protected String strProjectName;
	protected String strProjectOutputPath;
	protected String strServiceDatabaseIp;
	protected String strServiceDatabasePort;
	protected String strServiceDatabaseUsername;
	protected String strServiceDatabasePassword;
	
	public APIMProducer(ArrayList<YamlResource> listOfYamlResources){
		this.listOfYamlResources = listOfYamlResources;
		this.oRestServicePIMFactory = ServicePIMFactory.eINSTANCE;
		this.strProjectName = "Amir Project";
		this.oRESTfulServicePIM = this.oRestServicePIMFactory.createRESTfulServicePIM();
		this.oRESTfulServicePIM.setName(strProjectName);
		this.oRESTfulServicePIM.setOutputPath("");
		this.oRESTfulServicePIM.setDbIP("");
		this.oRESTfulServicePIM.setDbPort("");
		this.oRESTfulServicePIM.setDbUsername("");
		this.oRESTfulServicePIM.setDbPassword("");
	}
	
	public APIMProducer(ArrayList<YamlResource> listOfYamlResources, String strProjectName, String strProjectOutputPath, String strServiceDatabaseIp, String strServiceDatabasePort, String strServiceDatabaseUsername, String strServiceDatabasePassword){
		this.listOfYamlResources = listOfYamlResources;
		this.oRestServicePIMFactory = ServicePIMFactory.eINSTANCE;
		this.strProjectName = strProjectName;
		this.oRESTfulServicePIM = this.oRestServicePIMFactory.createRESTfulServicePIM();
		this.oRESTfulServicePIM.setName(strProjectName);
		this.oRESTfulServicePIM.setOutputPath(strProjectOutputPath);
		this.oRESTfulServicePIM.setDbIP(strServiceDatabaseIp);
		this.oRESTfulServicePIM.setDbPort(strServiceDatabasePort);
		this.oRESTfulServicePIM.setDbUsername(strServiceDatabaseUsername);
		this.oRESTfulServicePIM.setDbPassword(strServiceDatabasePassword);
	}
	
	public RESTfulServicePIM getRESTfulServicePIM(){
		return this.oRESTfulServicePIM;
	}
	
	public ServicePIMFactory getRESTServicePIMFactory(){
		return this.oRestServicePIMFactory;
	}
	
	public String getProjectName(){
		return this.strProjectName;
	}
	
	public abstract RESTfulServicePIM producePIM();
}