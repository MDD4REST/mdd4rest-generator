package org.cargo.command.domain;

import java.util.List;
import org.cargo.command.domain.Planet;
import org.cargo.command.exception.PlanetNotFoundException;

/**
 * Generated interface for Repository for Planet
 */
public interface PlanetRepository {

	public final static String BEAN_ID = "planetRepository";

	public Planet findById(Long id) throws PlanetNotFoundException;

	public Planet save(Planet entity);

	public void delete(Planet entity);

	public List<Planet> findAll();

}
