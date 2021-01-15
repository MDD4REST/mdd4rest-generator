package org.cargo.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of RegistrationResource.
 */
@Controller
public class RegistrationResource extends RegistrationResourceBase {

	public RegistrationResource() {
	}

	@RequestMapping(value = "/cargoes/registration", method = RequestMethod.GET)
	public void bookingFormView() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("bookingFormView not implemented");
	}

	@RequestMapping(value = "/cargoes/registration", method = RequestMethod.POST)
	public void bookingNewCargo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("bookingNewCargo not implemented");
	}

}
