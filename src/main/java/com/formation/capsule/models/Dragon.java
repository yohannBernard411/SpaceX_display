package com.formation.capsule.models;

import java.util.ArrayList;

public class Dragon {
	
	private String id;
	private String name;
	private String type;
	private Boolean active;
	private Number crew_capacity;
	private Number sidewall_angle_deg;
	private Number orbit_duration_yr;
	private Number dry_mass_kg;
	private Number dry_mass_lb;
	private String first_flight;
	private HeatShield heat_shield;
    private ArrayList<Thrusters> thrusters;
    private LPM launch_payload_mass;
    private LPV launch_payload_vol;
    private RPM return_payload_mass;
    private RPV return_payload_vol;
	private PC pressurized_capsule;
	private Trunk trunk;
	private HWTrunk height_w_trunk;
	private Diameter diameter;
	private ArrayList<String> flickr_images;
	private String wikipedia;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Number getCrew_capacity() {
		return crew_capacity;
	}
	public void setCrew_capacity(Number crew_capacity) {
		this.crew_capacity = crew_capacity;
	}
	public Number getSidewall_angle_deg() {
		return sidewall_angle_deg;
	}
	public void setSidewall_angle_deg(Number sidewall_angle_deg) {
		this.sidewall_angle_deg = sidewall_angle_deg;
	}
	public Number getOrbit_duration_yr() {
		return orbit_duration_yr;
	}
	public void setOrbit_duration_yr(Number orbit_duration_yr) {
		this.orbit_duration_yr = orbit_duration_yr;
	}
	public Number getDry_mass_kg() {
		return dry_mass_kg;
	}
	public void setDry_mass_kg(Number dry_mass_kg) {
		this.dry_mass_kg = dry_mass_kg;
	}
	public Number getDry_mass_lb() {
		return dry_mass_lb;
	}
	public void setDry_mass_lb(Number dry_mass_lb) {
		this.dry_mass_lb = dry_mass_lb;
	}
	public String getFirst_flight() {
		return first_flight;
	}
	public void setFirst_flight(String first_flight) {
		this.first_flight = first_flight;
	}
	public HeatShield getHeat_shield() {
		return heat_shield;
	}
	public void setHeat_shield(HeatShield heat_shield) {
		this.heat_shield = heat_shield;
	}
	public ArrayList<Thrusters> getThrusters() {
		return thrusters;
	}
	public void setThrusters(ArrayList<Thrusters> thrusters) {
		this.thrusters = thrusters;
	}
	public LPM getLaunch_payload_mass() {
		return launch_payload_mass;
	}
	public void setLaunch_payload_mass(LPM launch_payload_mass) {
		this.launch_payload_mass = launch_payload_mass;
	}
	public LPV getLaunch_payload_vol() {
		return launch_payload_vol;
	}
	public void setLaunch_payload_vol(LPV launch_payload_vol) {
		this.launch_payload_vol = launch_payload_vol;
	}
	public RPM getReturn_payload_mass() {
		return return_payload_mass;
	}
	public void setReturn_payload_mass(RPM return_payload_mass) {
		this.return_payload_mass = return_payload_mass;
	}
	public RPV getReturn_payload_vol() {
		return return_payload_vol;
	}
	public void setReturn_payload_vol(RPV return_payload_vol) {
		this.return_payload_vol = return_payload_vol;
	}
	public PC getPressurized_capsule() {
		return pressurized_capsule;
	}
	public void setPressurized_capsule(PC pressurized_capsule) {
		this.pressurized_capsule = pressurized_capsule;
	}
	public Trunk getTrunk() {
		return trunk;
	}
	public void setTrunk(Trunk trunk) {
		this.trunk = trunk;
	}
	public HWTrunk getHeight_w_trunk() {
		return height_w_trunk;
	}
	public void setHeight_w_trunk(HWTrunk height_w_trunk) {
		this.height_w_trunk = height_w_trunk;
	}
	public Diameter getDiameter() {
		return diameter;
	}
	public void setDiameter(Diameter diameter) {
		this.diameter = diameter;
	}
	public ArrayList<String> getFlickr_images() {
		return flickr_images;
	}
	public void setFlickr_images(ArrayList<String> flickr_images) {
		this.flickr_images = flickr_images;
	}
	public String getWikipedia() {
		return wikipedia;
	}
	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

		
}
