package com.citys.rest.share.repositorys;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.citys.rest.share.model.City;

/**
 * {@link City} repository, data access objects.
 * @author ashishkin
 *
 */
public interface CityRepo extends CrudRepository<City, Long>{

	/**
	 * Find all city's related to specific country.
	 * @param country - provided country code
	 * @return {@link City} data collection
	 */
	Collection<City> findAllByCountry(String country);
}
