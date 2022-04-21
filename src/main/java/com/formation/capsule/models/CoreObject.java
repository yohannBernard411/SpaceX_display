package com.formation.capsule.models;

public class CoreObject {
	
	private String core_serial;
	private Number flight;
	private Number block;
	private Boolean gridfins;
	private Boolean legs;
	private Boolean reused;
	private Boolean land_success;
	private Boolean landing_intent;
	private String landing_type;
	private String landing_vehicle;
	
	public String getCore_serial() {
		return core_serial;
	}
	public void setCore_serial(String core_serial) {
		this.core_serial = core_serial;
	}
	public Number getFlight() {
		return flight;
	}
	public void setFlight(Number flight) {
		this.flight = flight;
	}
	public Number getBlock() {
		return block;
	}
	public void setBlock(Number block) {
		this.block = block;
	}
	public Boolean getGridfins() {
		return gridfins;
	}
	public void setGridfins(Boolean gridfins) {
		this.gridfins = gridfins;
	}
	public Boolean getLegs() {
		return legs;
	}
	public void setLegs(Boolean legs) {
		this.legs = legs;
	}
	public Boolean getReused() {
		return reused;
	}
	public void setReused(Boolean reused) {
		this.reused = reused;
	}
	public Boolean getLand_success() {
		return land_success;
	}
	public void setLand_success(Boolean land_success) {
		this.land_success = land_success;
	}
	public Boolean getLanding_intent() {
		return landing_intent;
	}
	public void setLanding_intent(Boolean landing_intent) {
		this.landing_intent = landing_intent;
	}
	public String getLanding_type() {
		return landing_type;
	}
	public void setLanding_type(String landing_type) {
		this.landing_type = landing_type;
	}
	public String getLanding_vehicle() {
		return landing_vehicle;
	}
	public void setLanding_vehicle(String landing_vehicle) {
		this.landing_vehicle = landing_vehicle;
	}
	
	

}
