package com.formation.capsule.models;

public class FirstStage2 {
	
	private Boolean reusable;
	private Number engines;
	private Number fuel_amount_tons;
	private Number burn_time_sec;
	private ThrustSeaLevel thrust_sea_level;
	private ThrustVacuum thrust_vacuum;
	
	public Boolean getReusable() {
		return reusable;
	}
	public void setReusable(Boolean reusable) {
		this.reusable = reusable;
	}
	public Number getEngines() {
		return engines;
	}
	public void setEngines(Number engines) {
		this.engines = engines;
	}
	public Number getFuel_amount_tons() {
		return fuel_amount_tons;
	}
	public void setFuel_amount_tons(Number fuel_amount_tons) {
		this.fuel_amount_tons = fuel_amount_tons;
	}
	public Number getBurn_time_sec() {
		return burn_time_sec;
	}
	public void setBurn_time_sec(Number burn_time_sec) {
		this.burn_time_sec = burn_time_sec;
	}
	public ThrustSeaLevel getThrust_sea_level() {
		return thrust_sea_level;
	}
	public void setThrust_sea_level(ThrustSeaLevel thrust_sea_level) {
		this.thrust_sea_level = thrust_sea_level;
	}
	public ThrustVacuum getThrust_vacuum() {
		return thrust_vacuum;
	}
	public void setThrust_vacuum(ThrustVacuum thrust_vacuum) {
		this.thrust_vacuum = thrust_vacuum;
	}

}
