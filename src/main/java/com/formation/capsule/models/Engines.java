package com.formation.capsule.models;

public class Engines {
	
	
	private Number number;
	private String type;
	private String version;
	private String layout;
	private Isp isp;
	private Number engine_loss_max;
	private String propellant_1;
	private String propellant_2;
	private ThrustSeaLevel thrust_sea_level;
	private ThrustVacuum thrust_vacuum;
	private Number thrust_to_weight;
	
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public Isp getIsp() {
		return isp;
	}
	public void setIsp(Isp isp) {
		this.isp = isp;
	}
	public Number getEngine_loss_max() {
		return engine_loss_max;
	}
	public void setEngine_loss_max(Number engine_loss_max) {
		this.engine_loss_max = engine_loss_max;
	}
	public String getPropellant_1() {
		return propellant_1;
	}
	public void setPropellant_1(String propellant_1) {
		this.propellant_1 = propellant_1;
	}
	public String getPropellant_2() {
		return propellant_2;
	}
	public void setPropellant_2(String propellant_2) {
		this.propellant_2 = propellant_2;
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
	public Number getThrust_to_weight() {
		return thrust_to_weight;
	}
	public void setThrust_to_weight(Number thrust_to_weight) {
		this.thrust_to_weight = thrust_to_weight;
	}
	
	
	
	

}
