package com.formation.capsule.models;

import java.util.ArrayList;

public class Capsule {
	
	private String capsule_serial;
	private String capsule_id;
	private String status;
	private String original_launch;
	private Number original_launch_unix;
	private ArrayList<Mission> missions;
	private Number landings;
	private String type;
	private String details;
	private Number reuse_count;
	
	public String getCapsule_serial() {
		return capsule_serial;
	}
	public void setCapsule_serial(String capsule_serial) {
		this.capsule_serial = capsule_serial;
	}
	public String getCapsule_id() {
		return capsule_id;
	}
	public void setCapsule_id(String capsule_id) {
		this.capsule_id = capsule_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOriginal_launch() {
		return original_launch;
	}
	public void setOriginal_launch(String original_launch) {
		this.original_launch = original_launch;
	}
	public Number getOriginal_launch_unix() {
		return original_launch_unix;
	}
	public void setOriginal_launch_unix(Number original_launch_unix) {
		this.original_launch_unix = original_launch_unix;
	}
	public ArrayList<Mission> getMissions() {
		return missions;
	}
	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}
	public Number getLandings() {
		return landings;
	}
	public void setLandings(Number landings) {
		this.landings = landings;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Number getReuse_count() {
		return reuse_count;
	}
	public void setReuse_count(Number reuse_count) {
		this.reuse_count = reuse_count;
	}

}
