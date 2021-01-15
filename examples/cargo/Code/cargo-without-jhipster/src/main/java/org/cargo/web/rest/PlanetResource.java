package org.cargo.web.rest;

import org.cargo.command.domain.Planet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of PlanetResource.
 */
@Controller
public class PlanetResource extends PlanetResourceBase {

	public PlanetResource() {
	}

	@RequestMapping(value = "/planet/form", method = RequestMethod.GET)
	public String createForm(ModelMap modelMap) {
		Planet entity = new Planet();
		modelMap.addAttribute("entity", entity);
		return "planet/create";
	}

}
