package org.cargo.command.domain;

import org.cargo.command.domain.Cargo;
import org.cargo.command.domain.TrackingID;

/**
 * Generated interface for Repository for Cargo
 */
public interface CargoRepository {

	public final static String BEAN_ID = "cargoRepository";

	public Cargo save(Cargo entity);

	public TrackingID nextTrackingId();

	public void detachItineray(Cargo cargo);

}
