package com.github.icelyframework.generator.mde.pimGenerator;

import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.Role;
import com.github.icelyframework.staticview.Aggregate;
import com.github.icelyframework.staticview.Application;
import com.github.icelyframework.staticview.DomainObject;
import com.github.icelyframework.staticview.PrimitiveType;
import com.github.icelyframework.staticview.Project;
import com.github.icelyframework.staticview.Property;
import com.github.icelyframework.staticview.StaticviewFactory;

public class PIMUtils {
	
	protected Project oPIMStatic;
	protected com.github.icelyframework.dynamicview.Project oPIMDynamic;
	protected StaticviewFactory oStaticviewFactory;
	protected DynamicviewFactory oDynamicPIMFactory;
	
	public PIMUtils(Project oPIMStatic, com.github.icelyframework.dynamicview.Project oPIMDynamic) {
		this.oPIMStatic = oPIMStatic;
		this.oPIMDynamic = oPIMDynamic;
		this.oStaticviewFactory = StaticviewFactory.eINSTANCE;
		this.oDynamicPIMFactory = DynamicviewFactory.eINSTANCE;
	}
	
	public Property findProperty(DomainObject domainObject, String propertyName) {
		for(Property property : domainObject.getHasProperty()) {
			if(property.getName().equals(propertyName)) {
				return property;
			}
		}
		return null;
	}
	
	public Property findProperty(String applicationName, String domainObjectName, String propertyName) {
		DomainObject domainObject = findDomainObject(domainObjectName, applicationName);
		if(domainObject == null)
			return null;
	
		for(Property property : domainObject.getHasProperty()) {
			if(property.getName().equals(propertyName)) {
				return property;
			}
		}
		return null;
	}
	
	public Role findRole(String name, String applicationName) {
		com.github.icelyframework.dynamicview.Application application = findDynamicApplication(applicationName);
		for(Role role :application.getHasRole()) {
			if(role.getName().equals(name)) {
				return role;
			}
		}
		return null;
	}
	
	public PrimitiveType findPrimitiveType(String name) {
		for(PrimitiveType primitiveType :oPIMStatic.getPrimitiveTypes()) {
			if(primitiveType.getType().getName().equalsIgnoreCase(name)) {
				return primitiveType;
			}
		}
		return null;
	}
	
	public Application findApplication(String name) {
		for(Application application: oPIMStatic.getHasApplication()) {
			if(application.getName().equalsIgnoreCase(name)) {
				return application;
			}
		}
		return null;
	}
	
	public DomainObject findDomainObject(String name, String applicationName) {
		Application application = findApplication(applicationName);
		for (Aggregate aggregate: application.getHasAggregate()) {
			for (DomainObject domainObject: aggregate.getHasDomainobject()) {
				if(domainObject.getName().equalsIgnoreCase(name)) {
					return domainObject;
				}
			}
		}
		return null;
	}
	
	public com.github.icelyframework.dynamicview.Application findDynamicApplication(String name) {
		for(com.github.icelyframework.dynamicview.Application application: oPIMDynamic.getHasApplication()) {
			if(application.getName().equalsIgnoreCase(name)) {
				return application;
			}
		}
		return null;
	}
	
	public com.github.icelyframework.dynamicview.DomainObject findDynamicDomainObject(String name, String applicationName) {
		com.github.icelyframework.dynamicview.Application application = findDynamicApplication(applicationName);
		for (com.github.icelyframework.dynamicview.Aggregate aggregate: application.getHasAggregate()) {
			for (com.github.icelyframework.dynamicview.DomainObject domainObject: aggregate.getDomainobjects()) {
				if(domainObject.getName().equalsIgnoreCase(name)) {
					return domainObject;
				}
			}
		}
		return null;
	}
	
	public com.github.icelyframework.dynamicview.ProcessOperation findProcessOperation(String name, String applicationName) {
		com.github.icelyframework.dynamicview.Application application = findDynamicApplication(applicationName);
		for (com.github.icelyframework.dynamicview.Aggregate aggregate: application.getHasAggregate()) {
			for (com.github.icelyframework.dynamicview.Process process: aggregate.getHasProcess()) {
				for(com.github.icelyframework.dynamicview.ProcessOperation processOperation: process.getHasOperation()) {
					if (processOperation.getName().equalsIgnoreCase(name)) {
						return processOperation;
					}
				}
			}
		}
		return null;
	}
	
}
