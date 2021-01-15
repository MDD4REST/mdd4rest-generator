package org.cargo.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of RoutesResource.
 */
@Controller
public class RoutesResource extends RoutesResourceBase {

	public RoutesResource() {
	}

	@RequestMapping(value = "/cargoes/{trackingID}/routes", method = RequestMethod.GET)
	public void assignCargoToRoute() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("assignCargoToRoute not implemented");
	}

	@RequestMapping(value = "/cargoes/{trackingID}/routes", method = RequestMethod.POST)
	public void requestPossibleRoutesForCargo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("requestPossibleRoutesForCargo not implemented");
	}

}
