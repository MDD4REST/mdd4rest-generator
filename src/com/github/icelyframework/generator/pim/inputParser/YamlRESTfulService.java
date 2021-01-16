package com.github.icelyframework.generator.pim.inputParser;

import java.util.ArrayList;

public class YamlRESTfulService {
	
	public ArrayList<YamlAggregate> Aggregates;
	public ArrayList<YamlApplication> Applications;
	public ArrayList<YamlRole> Roles;
	
	public YamlRESTfulService() {
		this.Aggregates = new ArrayList<YamlAggregate>();
		this.Applications = new ArrayList<YamlApplication>();
		this.Roles = new ArrayList<YamlRole>();
	}
	
	public void addAggregate(YamlAggregate Aggregate) {
		Aggregates.add(Aggregate);
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
	
	public ArrayList<YamlAggregate> getAggregates(){
		return this.Aggregates;
	}
	
	public YamlDomainObject getDomainObjectByName(String name, String aggregateName) {
		YamlAggregate yamlAggregate = getAggregateByName(aggregateName);;

		for (YamlDomainObject yamlDomainObject : yamlAggregate.getDomainObjects()) {
			if (yamlDomainObject.getName().equals(name))
				return yamlDomainObject;
		}
		return null;
	}
	
	public YamlActivity getActivityByName(String name, String aggregateName, String processName) {
		YamlProcess yamlProcess = getProcessByName(processName, aggregateName);
		for (YamlActivity yamlActivity : yamlProcess.getActivities()) {
			if (yamlActivity.getAction().equals(name))
				return yamlActivity;
		}
		return null;
	}
	
	public YamlProcess getProcessByName(String name, String aggregateName) {
		YamlAggregate yamlAggregate = getAggregateByName(aggregateName);
		
		for (YamlProcess yamlProcess : yamlAggregate.getProcess()) {
			if (yamlProcess.getName().equals(name))
				return yamlProcess;
		}
		return null;
	}
	
	
	
	public YamlAggregate getAggregateByName(String name) {
		for (YamlAggregate aggregate : Aggregates) {
			if (aggregate.getName().equals(name))
				return aggregate;
		}
		return null;
	}
	
	public ArrayList<YamlRole> getRoles(){
		return this.Roles;
	}
	
}