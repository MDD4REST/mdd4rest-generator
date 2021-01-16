package com.github.icelyframework.generator.pim.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlAggregate {
	public String Name;

	public ArrayList<YamlDomainObject> DomainObjects;

	public ArrayList<YamlProcess> Processes;


	public YamlAggregate() {
		this.Name = "DefaultAggregate";
		DomainObjects = new ArrayList<YamlDomainObject>();
		Processes = new ArrayList<YamlProcess>();
	}

	public YamlAggregate(String name) {
		this.Name = name;
		DomainObjects = new ArrayList<YamlDomainObject>();
		Processes = new ArrayList<YamlProcess>();
	}

	public void addDomainObject(YamlDomainObject domainObject) {
		if (!DomainObjects.contains(domainObject)) {
			DomainObjects.add(domainObject);
		}
	}

	public void addScheme(YamlProcess scheme) {
		if (!Processes.contains(scheme)) {
			Processes.add(scheme);
		}
	}

	@Override
	public String toString() {
		String all = "Aggregate:\n" + "Name: " + Name + "\n" + "DomainObjects: " + Arrays.asList(DomainObjects) + "\n"
				+ "Schemes: " + Arrays.asList(Processes);
		return all;
	}

	public String toYAMLString() {
		String all = "- Aggregate";
		all = "\n  Name: " + Name;
		if (DomainObjects.size() > 0) {
			all += "\n  DomainObjects:";
			for (YamlDomainObject domainObject : DomainObjects) {
				all += "\n" + domainObject.toYAMLString();
			}
		} else
			all += "\n  DomainObjects: []";

		if (Processes.size() > 0) {
			all += "\n  Processes:";
			for (YamlProcess process : Processes) {
				all += "\n" + process.toYAMLString();
			}
		} else
			all += "\n  Processes: []";
		return all;
	}

	@Override
	public boolean equals(Object obj) {
		return ((YamlAggregate) obj).Name.equals(Name);
	}

	@Override
	public int hashCode() {
		return Name.hashCode();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ArrayList<YamlDomainObject> getDomainObjects() {
		return DomainObjects;
	}

	public void setDomainObjects(ArrayList<YamlDomainObject> domainObjects) {
		DomainObjects = domainObjects;
	}

	public ArrayList<YamlProcess> getProcess() {
		return Processes;
	}

	public void setActivities(ArrayList<YamlProcess> processes) {
		Processes = processes;
	}

}
