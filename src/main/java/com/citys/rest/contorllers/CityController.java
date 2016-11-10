package com.citys.rest.contorllers;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citys.rest.services.AppServiceManager;
import com.citys.rest.share.model.City;

/**
 * Presentation city info service.
 * @author ashishkin
 *
 */
@CrossOrigin
@RestController
public class CityController {

	/**
	 * {@link AppServiceManager}.
	 */
	@Inject
	private AppServiceManager appServiceManager;

	/**
	 * Root API information.
	 * @return simple message.
	 */
	@RequestMapping("/")
	public String index() {
		return "Greetings from Citys Rest API Spring Boot!";
	}

	/**
	 * Provide JSON array of city data informations, for specific country/state.
	 * @param county - specific country short code.
	 * @return {@link City} data, JSon presentation array
	 */
	@RequestMapping(value = "/cities/{country}", method = RequestMethod.GET)
	public Collection<City> getCitys(@PathVariable String country) {
		return appServiceManager.getAllCitysForOneCountry(country);
	}

}
