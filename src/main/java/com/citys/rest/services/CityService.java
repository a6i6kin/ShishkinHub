package com.citys.rest.services;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.transaction.annotation.Transactional;

import com.citys.rest.share.model.City;
import com.citys.rest.share.repositorys.CityRepo;

/**
 * Service related to city data.
 * @author ashishkin
 *
 */
@Named
@Singleton
@Transactional
public class CityService {
	
	/**
	 * {@link CityRepo}
	 */
	@Inject
	private CityRepo cityRepo;
	
	/**
	 * Get all data informations for city's related to specific country or state.
	 * @param countryCode - country short code.
	 * @return related {@link City} data collection.
	 */
	public Collection<City> getAllCityPerCountryCode(String countryCode){
		return cityRepo.findAllByCountry(countryCode);
	}

}
