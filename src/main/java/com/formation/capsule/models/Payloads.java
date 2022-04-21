package com.formation.capsule.models;

import java.util.ArrayList;

public class Payloads {
	
	private Orbit_params orbit_params;
	private ArrayList<String> customers;
	private ArrayList<String> norad_id;
	private String payload_id;
	private Boolean reused;
	private String nationality;
	private String manufacturer;
	private String payload_type;
	private String orbit;
	public Orbit_params getOrbit_params() {
		return orbit_params;
	}
	public void setOrbit_params(Orbit_params orbit_params) {
		this.orbit_params = orbit_params;
	}
	public ArrayList<String> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<String> customers) {
		this.customers = customers;
	}
	public ArrayList<String> getNorad_id() {
		return norad_id;
	}
	public void setNorad_id(ArrayList<String> norad_id) {
		this.norad_id = norad_id;
	}
	public String getPayload_id() {
		return payload_id;
	}
	public void setPayload_id(String payload_id) {
		this.payload_id = payload_id;
	}
	public Boolean getReused() {
		return reused;
	}
	public void setReused(Boolean reused) {
		this.reused = reused;
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
	public String getOrbit() {
		return orbit;
	}
	public void setOrbit(String orbit) {
		this.orbit = orbit;
	}

	
	
}
