package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;


/**
 * Class extending an {@link ArrayList} of resources so that it returns a unique {@link Aggregate} for each name.
 * 
 * @author amirdeljouyi
 */
@SuppressWarnings("serial")
public class Aggregates extends ArrayList<Aggregate> {

	public void addAggregateIfItDoesNotExist(String name) {
		for (Aggregate aggregate : this) {
			if (aggregate.Name.equals(name))
				return;
		}
		add(new Aggregate(name));
	}


	
	public Aggregate getAggregateByName(String name) {
		for (Aggregate aggregate : this) {
			if (aggregate.Name.equals(name))
				return aggregate;
		}
		Aggregate aggregate = new Aggregate(name);
		add(aggregate);
		return aggregate;
	}
}
