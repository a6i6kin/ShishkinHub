package com.citys.rest.share.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity for city DB data table.
 * @author ashishkin
 *
 */
@Table
@Entity
public class City implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7921022121747112097L;
	
	/**
	 * Key table ID.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	/**
	 * Country short code.
	 */
	@JsonIgnore
	private String country;
	
	/**
	 * City name.
	 */
	private String city;
	
	/**
	 * City accent data.
	 */
	private String accent;
	
	/**
	 * Region short code.
	 */
	private String region;
	
	/**
	 * City population data.
	 */
	private Long population;
	
	/**
	 * Geographic coordinate, city position latitude.
	 */
	private BigDecimal latitude;
	
	/**
	 * Geographic coordinate, city position longitude.
	 */
	private BigDecimal longitude;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAccent() {
		return accent;
	}

	public void setAccent(String accent) {
		this.accent = accent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	
}
