package mde.pimGenerator;

import DynamicPIM.DynamicPIMFactory;
import StaticPIM.Aggregate;
import StaticPIM.Application;
import StaticPIM.DomainObject;
import StaticPIM.PrimitiveType;
import StaticPIM.Project;
import StaticPIM.Property;
import StaticPIM.StaticPIMFactory;

public class RESTfulServiceUtils {
	
	protected Project oPIMStatic;
	protected DynamicPIM.Project oPIMDynamic;
	protected StaticPIMFactory oStaticPIMFactory;
	protected DynamicPIMFactory oDynamicPIMFactory;
//	protected SecurityPIMMetamodelFactory oSecurityPIMFactory;
	
	public RESTfulServiceUtils(Project oPIMStatic, DynamicPIM.Project oPIMDynamic) {
		this.oPIMStatic = oPIMStatic;
		this.oPIMDynamic = oPIMDynamic;
		this.oStaticPIMFactory = StaticPIMFactory.eINSTANCE;
		this.oDynamicPIMFactory = DynamicPIMFactory.eINSTANCE;
//		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
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
//		System.out.println(oRESTfulServicePIM.getHasResources());
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
	
//	public Role findRole(String name) {
////		System.out.println(oRESTfulServicePIM.getHasResources());
//		for(Role role :oPIMDomain.getHasRoles()) {
////			System.out.println(resource.getName() + " " + name);
//			if(role.getName().equals(name)) {
////				System.out.println("find: " + resource);
//				return role;
//			}
//		}
//		return null;
//	}
	
	public PrimitiveType findPrimitiveType(String name) {
		for(PrimitiveType primitiveType :oPIMStatic.getPrimitiveTypes()) {
			if(primitiveType.getType().getName().equalsIgnoreCase(name)) {
				return primitiveType;
			}
		}
		return null;
	}
	
	public Application findApplicattion(String name) {
		for(Application application: oPIMStatic.getHasApplication()) {
			if(application.getName().equalsIgnoreCase(name)) {
				return application;
			}
		}
		return null;
	}
	
	public DomainObject findDomainObject(String name, String applicationName) {
		Application application = findApplicattion(applicationName);
		for (Aggregate aggregate: application.getHasAggregate()) {
			for (DomainObject domainObject: aggregate.getHasDomainobject()) {
				if(domainObject.getName().equalsIgnoreCase(name)) {
					return domainObject;
				}
			}
		}
		return null;
	}
	
	public DynamicPIM.Application findDynamicApplicattion(String name) {
		for(DynamicPIM.Application application: oPIMDynamic.getHasApplication()) {
			if(application.getName().equalsIgnoreCase(name)) {
				return application;
			}
		}
		return null;
	}
	
	public DynamicPIM.DomainObject findDynamicDomainObject(String name, String applicationName) {
		DynamicPIM.Application application = findDynamicApplicattion(applicationName);
		for (DynamicPIM.Aggregate aggregate: application.getHasAggregate()) {
			for (DynamicPIM.DomainObject domainObject: aggregate.getDomainobjects()) {
				if(domainObject.getName().equalsIgnoreCase(name)) {
					return domainObject;
				}
			}
		}
		return null;
	}
	
	public DynamicPIM.ProcessOperation findProcessOperation(String name, String applicationName) {
		DynamicPIM.Application application = findDynamicApplicattion(applicationName);
		for (DynamicPIM.Aggregate aggregate: application.getHasAggregate()) {
			for (DynamicPIM.Process process: aggregate.getHasProcess()) {
				for(DynamicPIM.ProcessOperation processOperation: process.getHasOperation()) {
					if (processOperation.getName().equalsIgnoreCase(name)) {
						return processOperation;
					}
				}
			}
		}
		return null;
	}
	
}
