package com.formation.capsule.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formation.capsule.models.Location;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReponseLandpadAPIEntity {
	
	@JsonProperty(value="id")
	private String id;
	@JsonProperty(value="full_name")
	private String full_name;
	@JsonProperty(value="status")
	private String status;
	@JsonProperty(value="location")
	private Location location;
	@JsonProperty(value="landing_type")
	private String landing_type;
	@JsonProperty(value="attempted_landings")
	private Number attempted_landings;
	@JsonProperty(value="successful_landings")
	private Number successful_landings;
	@JsonProperty(value="wikipedia")
	private String wikipedia;
	@JsonProperty(value="details")
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
