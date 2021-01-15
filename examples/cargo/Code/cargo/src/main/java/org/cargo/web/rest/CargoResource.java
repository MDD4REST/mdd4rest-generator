package org.cargo.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of CargoResource.
 */
@Controller
public class CargoResource extends CargoResourceBase {

	public CargoResource() {
	}

	@RequestMapping(value = "/cargoes/{trackingID}", method = RequestMethod.GET)
	public void cargoDetailsView() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("cargoDetailsView not implemented");
	}

}
