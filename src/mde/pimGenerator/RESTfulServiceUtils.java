package mde.pimGenerator;

import QueryPIM.QueryPIMMetamodelFactory;
import SecurityPIM.Role;
import SecurityPIM.SecurityPIMMetamodelFactory;
import SecurityPIM.User;
import SecurityPIM.Username;
import ServicePIM.BasicType;
import ServicePIM.Enumeration;
import ServicePIM.Property;
import ServicePIM.PropertyType;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.Resource;
import ServicePIM.ServicePIMFactory;

public class RESTfulServiceUtils {
	
	protected RESTfulServicePIM oRESTfulServicePIM;
	protected ServicePIMFactory oServicePIMFactory;
	protected SecurityPIMMetamodelFactory oSecurityPIMFactory;
	protected QueryPIMMetamodelFactory oQueryPIMFactory;
	
	public RESTfulServiceUtils(RESTfulServicePIM oRESTfulServicePIM) {
		this.oRESTfulServicePIM = oRESTfulServicePIM;
		this.oServicePIMFactory = ServicePIMFactory.eINSTANCE;
		this.oSecurityPIMFactory = SecurityPIMMetamodelFactory.eINSTANCE;
		this.oQueryPIMFactory = QueryPIMMetamodelFactory.eINSTANCE;
	}
	
	public Resource UserResource() {
		User user = this.oSecurityPIMFactory.createUser();
		Username username = this.oSecurityPIMFactory.createUsername();
		username.setIsNamingProperty(true);
		username.setIsRequired(true);
		username.setIsUnique(true);
		username.setName("username");
		BasicType type = this.oServicePIMFactory.createBasicType();
		type.setType(PropertyType.STRING);
		username.setType(type);
		user.setName("User");
		user.setIsAlgorithmic(false);
		user.setUsername(username);
		user.getHasProperty().add(username);
		return user;
	}
	
	public Resource CurrentUserResource() {
		User user = this.oSecurityPIMFactory.createCurrentUser();
		Username username = this.oSecurityPIMFactory.createUsername();
		username.setIsNamingProperty(true);
		username.setIsRequired(true);
		username.setIsUnique(true);
		username.setName("username");
		BasicType type = this.oServicePIMFactory.createBasicType();
		type.setType(PropertyType.STRING);
		username.setType(type);
		user.setName("CurrentUser");
		user.setIsAlgorithmic(false);
		user.setUsername(username);
		user.getHasProperty().add(username);
		return user;
	}
	public Resource findResource(String name) {
//		System.out.println(oRESTfulServicePIM.getHasResources());
		for(Resource resource :oRESTfulServicePIM.getHasResources()) {
//			System.out.println(resource.getName() + " " + name);
			if(resource.getName().equals(name)) {
//				System.out.println("find: " + resource);
				return resource;
			}
		}
		return null;
	}
	
//	public Resource findResourceWithDefaults(String name) {
////		System.out.println(oRESTfulServicePIM.getHasResources());
//		Resource resource = findResource(name);
//		if (resource == null) {
//			System.out.println("findResourceWithDefaults:: " + name);
//			if (name.equals("User")) {
//				
//				resource = user;
//			} else if (name.equals("CurrentUser")){
//				
//			}
//		}
//		return resource;
//	}
	
	public Property findProperty(Resource resource, String propertyName) {
		for(Property property : resource.getHasProperty()) {
			if(property.getName().equals(propertyName)) {
				return property;
			}
		}
		return null;
	}
	
	public Property findProperty(String resourceName, String propertyName) {
//		System.out.println(oRESTfulServicePIM.getHasResources());
		Resource resource = findResource(resourceName);
		if(resource == null)
			return null;
	
		for(Property property : resource.getHasProperty()) {
			if(property.getName().equals(propertyName)) {
				return property;
			}
		}
		return null;
	}
	
//	public Property findPropertyWithDefaults(String resourceName, String propertyName) {
////		System.out.println(oRESTfulServicePIM.getHasResources());
//		Resource resource = findResourceWithDefaults(resourceName);
//		if(resource == null)
//			return null;
//	
//		for(Property property : resource.getHasProperty()) {
//			if(property.getName().equals(propertyName)) {
//				return property;
//			}
//		}
//		return null;
//	}
	
	public Role findRole(String name) {
//		System.out.println(oRESTfulServicePIM.getHasResources());
		for(Role role :oRESTfulServicePIM.getHasRoles()) {
//			System.out.println(resource.getName() + " " + name);
			if(role.getName().equals(name)) {
//				System.out.println("find: " + resource);
				return role;
			}
		}
		return null;
	}
	
	public Enumeration findEnumeration(String name) {
		for(Enumeration enumeration :oRESTfulServicePIM.getEnumerations()) {
			if(enumeration.getName().equals(name)) {
				return enumeration;
			}
		}
		return null;
	}
	
	public BasicType findBasicType(String name) {
		for(BasicType basicType :oRESTfulServicePIM.getBasictypes()) {
			if(basicType.getType().getName().equalsIgnoreCase(name)) {
				return basicType;
			}
		}
		return null;
	}
}
