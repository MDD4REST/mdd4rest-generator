package com.github.icelyframework.generator.pim.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlApplication {

	public String Name;
	public ArrayList<String> Aggregates;
	public ArrayList<String> Resources;
	public ArrayList<String> Roles;

	public YamlApplication() {

	}

	public YamlApplication(String name) {
		this.Name = name;
		this.Resources = new ArrayList<String>();
		this.Roles = new ArrayList<String>();
	}

	public void addAggregate(String aggregate) {
		if (!Aggregates.contains(aggregate))
			Aggregates.add(aggregate);
	}
	
	public void addResource(String resource) {
		if (!Resources.contains(resource))
			Resources.add(resource);
	}
	
	public void addRoles(String role) {
		if (!Roles.contains(role))
			Roles.add(role);
	}

	@Override
	public String toString() {
		String all = "Application:\n" + "Name: " + Name + "\n"
				+ "Roles: " + Arrays.asList(Roles) + "\n"
				+ "Aggregates: " + Arrays.asList(Aggregates) + "\n"
				+ "Resources: " + Arrays.asList(Resources) + "\n";
		return all;
	}

	public String toYAMLString() {
		String all = "- Application";
		all += "\n  Name: " + Name;
		all += "\n  Roles: " + Arrays.asList(Roles).toString().replaceAll("^\\[|\\]$", "");
		all += "\n  Resources: " + Arrays.asList(Resources).toString().replaceAll("^\\[|\\]$", "");
		return all;
	}

	@Override
	public boolean equals(Object obj) {
		return ((YamlApplication) obj).Name.equals(Name);
	}

	@Override
	public int hashCode() {
		return Name.hashCode();
	}
	
	public String getName(){
		return this.Name;
	}
	
	public ArrayList<String> getResources(){
		return this.Resources;
	}
	
	public ArrayList<String> getRoles(){
		return this.Roles;
	}

	public ArrayList<String> getAggregates() {
		return Aggregates;
	}

}
