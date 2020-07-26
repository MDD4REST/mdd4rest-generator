package mde.inputParser;

import java.util.ArrayList;

public class YamlRESTfulService {
	
	public ArrayList<YamlApplication> Applications;
	public ArrayList<YamlResource> Resources;
	public ArrayList<YamlRole> Roles;
	public ArrayList<YamlEnumeration> Enumerations;
	
	public YamlRESTfulService() {
		this.Enumerations = new ArrayList<YamlEnumeration>();
		this.Resources = new ArrayList<YamlResource>();
		this.Applications = new ArrayList<YamlApplication>();
		this.Roles = new ArrayList<YamlRole>();
	}
	
	public void addResource(YamlResource Resource) {
		Resources.add(Resource);
	}
	
	public void addEnumeration(YamlEnumeration Enumeration) {
		Enumerations.add(Enumeration);
	}
	
	public void addApplication(YamlApplication Application) {
		Applications.add(Application);
	}
	
	public void addRoles(YamlRole Role) {
		Roles.add(Role);
	}

	@Override
	public String toString() {
		return "";
	}

	public String toYAMLString() {
		String all = "";
		all += "\n";
		return all;
	}

	
	public ArrayList<YamlApplication> getApplications(){
		return this.Applications;
	}
	
	public ArrayList<YamlResource> getResources(){
		return this.Resources;
	}
	
	public ArrayList<YamlEnumeration> getEnumerations(){
		return this.Enumerations;
	}
	
	public ArrayList<YamlRole> getRoles(){
		return this.Roles;
	}
	
}