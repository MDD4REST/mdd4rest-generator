package org.cargo.command.accessimpl;

/**
 * Delete orphaned itineraries - conceptually the responsibility
 * of the Cargo aggregate
 */
public interface DeleteOrphanItineraryAccess {

	void execute();

}
