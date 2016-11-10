package com.citys.rest.services;

import java.util.Collection;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.citys.rest.share.model.City;

/**
 * All controller layer services, that are accessible from presentation layer.
 * Proxy that glue presentation layer with controller layer.
 * Here we can implement authorization security rules
 * @author ashishkin
 *
 */
@Named
@Singleton
public class AppServiceManager {
	
	/**
	 * {@link CityService}
	 */
	@Autowired
	private CityService cityService;
	
	/**
	 * {@link CityService}.{@link #getAllCitysForOneCountry(String)} service call.
	 * @param countryCode - country short code.
	 * @return related {@link City} data collection.
	 */
	public Collection<City> getAllCitysForOneCountry(String countryCode){
		return cityService.getAllCityPerCountryCode(countryCode);
	}

}
