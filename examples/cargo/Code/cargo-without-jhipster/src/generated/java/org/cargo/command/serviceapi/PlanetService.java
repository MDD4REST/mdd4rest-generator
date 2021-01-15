package org.cargo.command.serviceapi;

import java.util.List;
import org.cargo.command.domain.Planet;
import org.cargo.command.exception.PlanetNotFoundException;
import org.sculptor.framework.context.ServiceContext;

/**
 * Generated interface for the Service PlanetService.
 */
public interface PlanetService {

	public final static String BEAN_ID = "planetService";

	public Planet findById(ServiceContext ctx, Long id) throws PlanetNotFoundException;

	public List<Planet> findAll(ServiceContext ctx);

	public Planet save(ServiceContext ctx, Planet entity);

	public void delete(ServiceContext ctx, Planet entity);

}
