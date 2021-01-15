package org.cargo.command.repositoryimpl;

import org.cargo.command.domain.Cargo;
import org.cargo.command.domain.TrackingID;
import org.springframework.stereotype.Repository;

/**
 * Repository implementation for Cargo
 */
@Repository("cargoRepository")
public class CargoRepositoryImpl extends CargoRepositoryBase {

	public CargoRepositoryImpl() {
	}

	public TrackingID nextTrackingId() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("nextTrackingId not implemented");
	}

	public void detachItineray(Cargo cargo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("detachItineray not implemented");
	}

}
