package org.cargo.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of Destination.
 */
@Controller
public class Destination extends DestinationBase {

	public Destination() {
	}

	@RequestMapping(value = "/cargoes/{trackingID}/destination", method = RequestMethod.GET)
	public void pickNewDestinationView() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("pickNewDestinationView not implemented");
	}

	@RequestMapping(value = "/cargoes/{trackingID}/destination", method = RequestMethod.POST)
	public void changeDestination() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("changeDestination not implemented");
	}

}
