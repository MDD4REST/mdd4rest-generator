package org.cargo.command.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.cargo.command.accessimpl.DeleteOrphanItineraryAccess;
import org.cargo.command.accessimpl.DeleteOrphanItineraryAccessImpl;
import org.cargo.command.domain.Cargo;
import org.cargo.command.domain.CargoRepository;
import org.cargo.command.domain.TrackingID;
import org.cargo.command.exception.CargoNotFoundException;
import org.sculptor.framework.accessapi.PopulateAssociationsAccess;
import org.sculptor.framework.accessapi.SaveAccess;
import org.sculptor.framework.accessimpl.jpa.JpaPopulateAssociationsAccessImpl;
import org.sculptor.framework.accessimpl.jpa.JpaSaveAccessImpl;
import org.sculptor.framework.domain.AssociationSpecification;

/**
 * Generated base class for implementation of Repository for Cargo

 * <p>Make sure that subclass defines the following annotations:
 * <pre>
     @org.springframework.stereotype.Repository("cargoRepository")
 * </pre>
 *
 */
public abstract class CargoRepositoryBase implements CargoRepository {

	public CargoRepositoryBase() {
	}

	/**
	 * Delegates to {@link org.cargo.command.accessimpl.DeleteOrphanItineraryAccess}
	 */
	protected void deleteOrphanItinerary() {
		DeleteOrphanItineraryAccess ao = createDeleteOrphanItineraryAccess();

		ao.execute();

	}

	/**
	 * Delegates to {@link org.sculptor.framework.accessapi.PopulateAssociationsAccess}
	 */
	protected Cargo populateAssociations(Cargo entity, AssociationSpecification associationSpecification)
			throws CargoNotFoundException {

		PopulateAssociationsAccess<Cargo> ao = createPopulateAssociationsAccess();

		ao.setEntity(entity);
		ao.setAssociationSpecification(associationSpecification);
		ao.execute();
		if (ao.getResult() == null) {
			throw new CargoNotFoundException("No Cargo found with entity: " + entity);
		}
		return ao.getResult();
	}

	/**
	 * Delegates to {@link org.sculptor.framework.accessapi.SaveAccess}
	 */
	public Cargo save(Cargo entity) {

		SaveAccess<Cargo> ao = createSaveAccess();

		ao.setEntity(entity);
		ao.execute();
		return ao.getResult();
	}

	public abstract TrackingID nextTrackingId();

	public abstract void detachItineray(Cargo cargo);

	@PersistenceContext(unitName = "CargoEntityManagerFactory")
	private EntityManager entityManager;

	/**
	 * Dependency injection
	 */
	@PersistenceContext(unitName = "CargoEntityManagerFactory")
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	protected PopulateAssociationsAccess<Cargo> createPopulateAssociationsAccess() {
		JpaPopulateAssociationsAccessImpl<Cargo> ao = new JpaPopulateAssociationsAccessImpl<Cargo>(
				getPersistentClass());
		ao.setEntityManager(getEntityManager());
		return ao;
	}

	protected SaveAccess<Cargo> createSaveAccess() {
		JpaSaveAccessImpl<Cargo> ao = new JpaSaveAccessImpl<Cargo>(getPersistentClass());
		ao.setEntityManager(getEntityManager());
		return ao;
	}

	protected DeleteOrphanItineraryAccess createDeleteOrphanItineraryAccess() {
		DeleteOrphanItineraryAccessImpl ao = new DeleteOrphanItineraryAccessImpl();
		ao.setEntityManager(getEntityManager());
		return ao;
	}

	protected Class<Cargo> getPersistentClass() {
		return Cargo.class;
	}

}
