package com.formation.capsule.models;

public class Payload {

	private String payload_id;
	private Number[] norad_id;
	private Boolean reused;
	private String[] customers;
	private String nationality;
	private String manufacturer;
	private String payload_type;
	private Number payload_mass_kg;
	private Number payload_mass_lbs;
	private String orbit;
	private OrbitParams orbit_params;
	
	public String getPayload_id() {
		return payload_id;
	}
	public void setPayload_id(String payload_id) {
		this.payload_id = payload_id;
	}
	public Number[] getNorad_id() {
		return norad_id;
	}
	public void setNorad_id(Number[] norad_id) {
		this.norad_id = norad_id;
	}
	public Boolean getReused() {
		return reused;
	}
	public void setReused(Boolean reused) {
		this.reused = reused;
	}
	public String[] getCustomers() {
		return customers;
	}
	public void setCustomers(String[] customers) {
		this.customers = customers;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPayload_type() {
		return payload_type;
	}
	public void setPayload_type(String payload_type) {
		this.payload_type = payload_type;
	}
	public Number getPayload_mass_kg() {
		return payload_mass_kg;
	}
	public void setPayload_mass_kg(Number payload_mass_kg) {
		this.payload_mass_kg = payload_mass_kg;
	}
	public Number getPayload_mass_lbs() {
		return payload_mass_lbs;
	}
	public void setPayload_mass_lbs(Number payload_mass_lbs) {
		this.payload_mass_lbs = payload_mass_lbs;
	}
	public String getOrbit() {
		return orbit;
	}
	public void setOrbit(String orbit) {
		this.orbit = orbit;
	}
	public OrbitParams getOrbit_params() {
		return orbit_params;
	}
	public void setOrbit_params(OrbitParams orbit_params) {
		this.orbit_params = orbit_params;
	}

}
