package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	public String Name;

	public ArrayList<String> Aggregates;
	
	public ArrayList<String> Roles;
	
		
	public Application(String name) {
		this.Name = name;
		Aggregates = new ArrayList<String>();
		Roles = new ArrayList<String>();
	}
	
	public void addAggregate(String aggregate) {
		if (!Aggregates.contains(aggregate)) {
			Aggregates.add(aggregate);
		}
	}
	
	public void addRole(String role) {
		if (!Roles.contains(role)) {
			Roles.add(role);
		}
	}


	public String toYAMLString() {
		String all = "- Name: " + Name;
		all += "\n  Aggregates: " + Arrays.asList(Aggregates).toString().replaceAll("^\\[|\\]$", "");
		all += "\n  Roles: " + Arrays.asList(Roles).toString().replaceAll("^\\[|\\]$", "");
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		return ((Aggregate) obj).Name.equals(Name);
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
}
