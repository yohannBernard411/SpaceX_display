package com.formation.capsule.models;

import java.util.ArrayList;

public class Core {
	
	private String core_serial;
	private Number block;
	private String status;
	private String original_launch;
	private Number original_launch_unix;
	private ArrayList<Mission> missions;
	private Number reuse_count;
	private Number rtls_attempts;
	private Number rtls_landings;
	private Number asds_attempts;
	private Number asds_landings;
	private Boolean water_landing;
	private String details;
	
	public String getCore_serial() {
		return core_serial;
	}
	public void setCore_serial(String core_serial) {
		this.core_serial = core_serial;
	}
	public Number getBlock() {
		return block;
	}
	public void setBlock(Number block) {
		this.block = block;
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
	public Number getReuse_count() {
		return reuse_count;
	}
	public void setReuse_count(Number reuse_count) {
		this.reuse_count = reuse_count;
	}
	public Number getRtls_attempts() {
		return rtls_attempts;
	}
	public void setRtls_attempts(Number rtls_attempts) {
		this.rtls_attempts = rtls_attempts;
	}
	public Number getRtls_landings() {
		return rtls_landings;
	}
	public void setRtls_landings(Number rtls_landings) {
		this.rtls_landings = rtls_landings;
	}
	public Number getAsds_attempts() {
		return asds_attempts;
	}
	public void setAsds_attempts(Number asds_attempts) {
		this.asds_attempts = asds_attempts;
	}
	public Number getAsds_landings() {
		return asds_landings;
	}
	public void setAsds_landings(Number asds_landings) {
		this.asds_landings = asds_landings;
	}
	public Boolean getWater_landing() {
		return water_landing;
	}
	public void setWater_landing(Boolean water_landing) {
		this.water_landing = water_landing;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
