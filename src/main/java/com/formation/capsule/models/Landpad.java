package com.formation.capsule.models;

public class Landpad {
	
	private String id;
	private String full_name;
	private String status;
	private Location location;
	private String landing_type;
	private Number attempted_landings;
	private Number successful_landings;
	private String wikipedia;
	private String details;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLanding_type() {
		return landing_type;
	}
	public void setLanding_type(String landing_type) {
		this.landing_type = landing_type;
	}
	public Number getAttempted_landings() {
		return attempted_landings;
	}
	public void setAttempted_landings(Number attempted_landings) {
		this.attempted_landings = attempted_landings;
	}
	public Number getSuccessful_landings() {
		return successful_landings;
	}
	public void setSuccessful_landings(Number successful_landings) {
		this.successful_landings = successful_landings;
	}
	public String getWikipedia() {
		return wikipedia;
	}
	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
