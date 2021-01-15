package org.cargo.command.serviceimpl;

import java.util.List;
import org.cargo.command.domain.Planet;
import org.cargo.command.domain.PlanetRepository;
import org.cargo.command.exception.PlanetNotFoundException;
import org.cargo.command.serviceapi.PlanetService;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of PlanetService.
 */
@Service("planetService")
public class PlanetServiceImpl implements PlanetService {

	public PlanetServiceImpl() {
	}

	@Autowired
	private PlanetRepository planetRepository;

	protected PlanetRepository getPlanetRepository() {
		return planetRepository;
	}

	/**
	 * Delegates to {@link org.cargo.command.domain.PlanetRepository#findById}
	 */
	public Planet findById(ServiceContext ctx, Long id) throws PlanetNotFoundException {
		return planetRepository.findById(id);
	}

	/**
	 * Delegates to {@link org.cargo.command.domain.PlanetRepository#findAll}
	 */
	public List<Planet> findAll(ServiceContext ctx) {
		return planetRepository.findAll();
	}

	/**
	 * Delegates to {@link org.cargo.command.domain.PlanetRepository#save}
	 */
	public Planet save(ServiceContext ctx, Planet entity) {
		return planetRepository.save(entity);
	}

	/**
	 * Delegates to {@link org.cargo.command.domain.PlanetRepository#delete}
	 */
	public void delete(ServiceContext ctx, Planet entity) {
		planetRepository.delete(entity);
	}

}
