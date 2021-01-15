package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class representing a aggregate object.
 * 
 * @author amirdeljouyi
 */
public class Aggregate {

	public String Name;

	public ArrayList<DomainObject> DomainObjects;
	
	public ArrayList<Process> Processes;
		
		
	public Aggregate() {
		this.Name = "DefaultAggregate";
		DomainObjects = new ArrayList<DomainObject>();
		Processes = new ArrayList<Process>();
	}

	public Aggregate(String name) {
		this.Name = name;
		DomainObjects = new ArrayList<DomainObject>();
		Processes = new ArrayList<Process>();
	}

	
	public void addDomainObject(DomainObject domainObject) {
		if (!DomainObjects.contains(domainObject)) {
			DomainObjects.add(domainObject);
		}
	}
	
	public void addSchemes(Process scheme) {
		if (!Processes.contains(scheme)) {
			Processes.add(scheme);
		}
	}

	public String toYAMLString() {
		String all = "- Name: " + Name;
		if (DomainObjects.size() > 0) {
			all += "\n  DomainObjects:";
			for (DomainObject domainObject : DomainObjects) {
				all += "\n" + domainObject.toYAMLString();
			}
		} else
			all += "\n  DomainObjects: []";
		
		if (Processes.size() > 0) {
			all += "\n  Processes:";
			for (Process process : Processes) {
				all += "\n" + process.toYAMLString();
			}
		} else
			all += "\n  Processes: []";
		return all;
	}
	
	public Process getProcessByName(String name) {
		for (Process process : Processes) {
			if (process.Name.equals(name))
				return process;
		}
		Process process = new Process(name);
		Processes.add(process);
		return process;
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
