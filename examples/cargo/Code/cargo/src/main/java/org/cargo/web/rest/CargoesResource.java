package org.cargo.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of CargoesResource.
 */
@Controller
public class CargoesResource extends CargoesResourceBase {

	public CargoesResource() {
	}

	@RequestMapping(value = "/cargoes", method = RequestMethod.GET)
	public void cargoListView() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("cargoListView not implemented");
	}

}
