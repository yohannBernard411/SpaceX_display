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
    private String heat_shields_material;
    private Number heat_shields_size_meters;
    private Number heat_shields_temp_degrees;
    private String heat_shields_dev_partner;
    private ArrayList<Thrusters> thursters;
	private Number launch_payload_mass_kg;
	private Number launch_payload_mass_lb;
	private Number launch_payload_vol_cubic_meters;
	private Number launch_payload_vol_cubic_feet;
	private Number return_payload_mass_kg;
	private Number return_payload_mass_lb;
	private Number return_payload_vol_cubic_meters;
	private Number return_payload_vol_cubic_feet;
	private Number pressurized_capsule_payload_volume_cubic_meters;
	private Number pressurized_capsule_payload_volume_cubic_feet;
	private Number trunk_trunk_volume_cubic_meters;
	private Number trunk_trunk_volume_cubic_feet;
	private Number trunk_cargo_solar_array;
	private Boolean trunk_cargo_unpressurized_cargo;
	private Number height_w_trunk_meters;
	private Number height_w_trunk_feet;
	private Number diameter_meters;
	private Number diameter_feet;
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
	public String getHeat_shields_material() {
		return heat_shields_material;
	}
	public void setHeat_shields_material(String heat_shields_material) {
		this.heat_shields_material = heat_shields_material;
	}
	public Number getHeat_shields_size_meters() {
		return heat_shields_size_meters;
	}
	public void setHeat_shields_size_meters(Number heat_shields_size_meters) {
		this.heat_shields_size_meters = heat_shields_size_meters;
	}
	public Number getHeat_shields_temp_degrees() {
		return heat_shields_temp_degrees;
	}
	public void setHeat_shields_temp_degrees(Number heat_shields_temp_degrees) {
		this.heat_shields_temp_degrees = heat_shields_temp_degrees;
	}
	public String getHeat_shields_dev_partner() {
		return heat_shields_dev_partner;
	}
	public void setHeat_shields_dev_partner(String heat_shields_dev_partner) {
		this.heat_shields_dev_partner = heat_shields_dev_partner;
	}
	public ArrayList<Thrusters> getThursters() {
		return thursters;
	}
	public void setThursters(ArrayList<Thrusters> thursters) {
		this.thursters = thursters;
	}
	public Number getLaunch_payload_mass_kg() {
		return launch_payload_mass_kg;
	}
	public void setLaunch_payload_mass_kg(Number launch_payload_mass_kg) {
		this.launch_payload_mass_kg = launch_payload_mass_kg;
	}
	public Number getLaunch_payload_mass_lb() {
		return launch_payload_mass_lb;
	}
	public void setLaunch_payload_mass_lb(Number launch_payload_mass_lb) {
		this.launch_payload_mass_lb = launch_payload_mass_lb;
	}
	public Number getLaunch_payload_vol_cubic_meters() {
		return launch_payload_vol_cubic_meters;
	}
	public void setLaunch_payload_vol_cubic_meters(Number launch_payload_vol_cubic_meters) {
		this.launch_payload_vol_cubic_meters = launch_payload_vol_cubic_meters;
	}
	public Number getLaunch_payload_vol_cubic_feet() {
		return launch_payload_vol_cubic_feet;
	}
	public void setLaunch_payload_vol_cubic_feet(Number launch_payload_vol_cubic_feet) {
		this.launch_payload_vol_cubic_feet = launch_payload_vol_cubic_feet;
	}
	public Number getReturn_payload_mass_kg() {
		return return_payload_mass_kg;
	}
	public void setReturn_payload_mass_kg(Number return_payload_mass_kg) {
		this.return_payload_mass_kg = return_payload_mass_kg;
	}
	public Number getReturn_payload_mass_lb() {
		return return_payload_mass_lb;
	}
	public void setReturn_payload_mass_lb(Number return_payload_mass_lb) {
		this.return_payload_mass_lb = return_payload_mass_lb;
	}
	public Number getReturn_payload_vol_cubic_meters() {
		return return_payload_vol_cubic_meters;
	}
	public void setReturn_payload_vol_cubic_meters(Number return_payload_vol_cubic_meters) {
		this.return_payload_vol_cubic_meters = return_payload_vol_cubic_meters;
	}
	public Number getReturn_payload_vol_cubic_feet() {
		return return_payload_vol_cubic_feet;
	}
	public void setReturn_payload_vol_cubic_feet(Number return_payload_vol_cubic_feet) {
		this.return_payload_vol_cubic_feet = return_payload_vol_cubic_feet;
	}
	public Number getPressurized_capsule_payload_volume_cubic_meters() {
		return pressurized_capsule_payload_volume_cubic_meters;
	}
	public void setPressurized_capsule_payload_volume_cubic_meters(Number pressurized_capsule_payload_volume_cubic_meters) {
		this.pressurized_capsule_payload_volume_cubic_meters = pressurized_capsule_payload_volume_cubic_meters;
	}
	public Number getPressurized_capsule_payload_volume_cubic_feet() {
		return pressurized_capsule_payload_volume_cubic_feet;
	}
	public void setPressurized_capsule_payload_volume_cubic_feet(Number pressurized_capsule_payload_volume_cubic_feet) {
		this.pressurized_capsule_payload_volume_cubic_feet = pressurized_capsule_payload_volume_cubic_feet;
	}
	public Number getTrunk_trunk_volume_cubic_meters() {
		return trunk_trunk_volume_cubic_meters;
	}
	public void setTrunk_trunk_volume_cubic_meters(Number trunk_trunk_volume_cubic_meters) {
		this.trunk_trunk_volume_cubic_meters = trunk_trunk_volume_cubic_meters;
	}
	public Number getTrunk_trunk_volume_cubic_feet() {
		return trunk_trunk_volume_cubic_feet;
	}
	public void setTrunk_trunk_volume_cubic_feet(Number trunk_trunk_volume_cubic_feet) {
		this.trunk_trunk_volume_cubic_feet = trunk_trunk_volume_cubic_feet;
	}
	public Number getTrunk_cargo_solar_array() {
		return trunk_cargo_solar_array;
	}
	public void setTrunk_cargo_solar_array(Number trunk_cargo_solar_array) {
		this.trunk_cargo_solar_array = trunk_cargo_solar_array;
	}
	public Boolean getTrunk_cargo_unpressurized_cargo() {
		return trunk_cargo_unpressurized_cargo;
	}
	public void setTrunk_cargo_unpressurized_cargo(Boolean trunk_cargo_unpressurized_cargo) {
		this.trunk_cargo_unpressurized_cargo = trunk_cargo_unpressurized_cargo;
	}
	public Number getHeight_w_trunk_meters() {
		return height_w_trunk_meters;
	}
	public void setHeight_w_trunk_meters(Number height_w_trunk_meters) {
		this.height_w_trunk_meters = height_w_trunk_meters;
	}
	public Number getHeight_w_trunk_feet() {
		return height_w_trunk_feet;
	}
	public void setHeight_w_trunk_feet(Number height_w_trunk_feet) {
		this.height_w_trunk_feet = height_w_trunk_feet;
	}
	public Number getDiameter_meters() {
		return diameter_meters;
	}
	public void setDiameter_meters(Number diameter_meters) {
		this.diameter_meters = diameter_meters;
	}
	public Number getDiameter_feet() {
		return diameter_feet;
	}
	public void setDiameter_feet(Number diameter_feet) {
		this.diameter_feet = diameter_feet;
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
