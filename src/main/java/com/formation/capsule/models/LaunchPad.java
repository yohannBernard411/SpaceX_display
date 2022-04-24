package com.formation.capsule.models;

import java.util.ArrayList;

public class LaunchPad {
	
	private Location location;
	private ArrayList<String> vehicles_launched;
	private Number id;
	private String name;
	private String status;
	private Number attempted_launches;
	private Number successful_launches;
	private String wikipedia;
	private String details;
	private String site_id;
	private String site_name_long;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ArrayList<String> getVehicles_launched() {
		return vehicles_launched;
	}
	public void setVehicles_launched(ArrayList<String> vehicles_launched) {
		this.vehicles_launched = vehicles_launched;
	}
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Number getAttempted_launches() {
		return attempted_launches;
	}
	public void setAttempted_launches(Number attempted_launches) {
		this.attempted_launches = attempted_launches;
	}
	public Number getSuccessful_launches() {
		return successful_launches;
	}
	public void setSuccessful_launches(Number successful_launches) {
		this.successful_launches = successful_launches;
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
	public String getSite_id() {
		return site_id;
	}
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	public String getSite_name_long() {
		return site_name_long;
	}
	public void setSite_name_long(String site_name_long) {
		this.site_name_long = site_name_long;
	}

}
