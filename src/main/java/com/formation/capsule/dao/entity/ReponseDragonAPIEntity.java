package com.formation.capsule.dao.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formation.capsule.models.Thrusters;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReponseDragonAPIEntity {

	@JsonProperty(value="id")
	private Number id;
	@JsonProperty(value="name")
	private String name;
	@JsonProperty(value="type")
	private String type;
	@JsonProperty(value="active")
	private Boolean active;
	@JsonProperty(value="crew_capacity")
	private Number crew_capacity;
	@JsonProperty(value="sidewall_angle_deg")
	private Number sidewall_angle_deg;
	@JsonProperty(value="orbit_duration_yr")
	private Number orbit_duration_yr;
	@JsonProperty(value="dry_mass_kg")
	private Number dry_mass_kg;
	@JsonProperty(value="dry_mass_lb")
	private Number dry_mass_lb;
	@JsonProperty(value="first_flight")
	private String first_flight;
	@JsonProperty(value="heat_shields.material")
	private String heat_shields_material;
	@JsonProperty(value="heat_shields.size_meters")
	private String heat_shields_size_meters;
	@JsonProperty(value="heat_shields.temp_degrees")
	private String heat_shields_temp_degrees;
	@JsonProperty(value="heat_shields.dev_partner")
	private String heat_shields_dev_partner;
	@JsonProperty(value="thrusters")
	private ArrayList<Thrusters> thrusters;
	@JsonProperty(value="launch_payload_mass.kg")
	private String launch_payload_mass_kg;
	@JsonProperty(value="launch_payload_mass.lb")
	private String launch_payload_mass_lb;
	@JsonProperty(value="launch_payload_vol.cubic_meters")
	private String launch_payload_vol_cubic_meters;
	@JsonProperty(value="launch_payload_vol.cubic_feet")
	private String launch_payload_vol_cubic_feet;
	@JsonProperty(value="return_payload_mass.kg")
	private String return_payload_mass_kg;
	@JsonProperty(value="return_payload_mass.lb")
	private String return_payload_mass_lb;
	@JsonProperty(value="return_payload_vol.cubic_meters")
	private String return_payload_vol_cubic_meters;
	@JsonProperty(value="return_payload_vol.cubic_feet")
	private String return_payload_vol_cubic_feet;
	@JsonProperty(value="pressurized_capsule.payload_volume.cubic_meters")
	private String pressurized_capsule_payload_volume_cubic_meters;
	@JsonProperty(value="pressurized_capsule.payload_volume.cubic_feet")
	private String pressurized_capsule_payload_volume_cubic_feet;
	@JsonProperty(value="trunk.trunk_volume.cubic_meters")
	private String trunk_trunk_volume_cubic_meters;
	@JsonProperty(value="trunk.trunk_volume.cubuc_feet")
	private String trunk_trunk_volume_cubic_feet;
	@JsonProperty(value="trunk.cargo.solar_array")
	private String trunk_cargo_solar_array;
	@JsonProperty(value="trunk.cargo.unpressurized_cargo")
	private String trunk_cargo_unpressurized_cargo;
	@JsonProperty(value="height_w_trunk.meters")
	private String height_w_trunk_meters;
	@JsonProperty(value="height_w_trunk.feet")
	private String height_w_trunk_feet;
	@JsonProperty(value="diameter.meters")
	private String diameter_meters;
	@JsonProperty(value="diameter.feet")
	private String diameter_feet;
	@JsonProperty(value="flickr_images")
	private ArrayList<String> flickr_images;
	@JsonProperty(value="wikipedia")
	private String wikipedia;
	@JsonProperty(value="description")
	private String description;
	
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
	public String getHeat_shields_size_meters() {
		return heat_shields_size_meters;
	}
	public void setHeat_shields_size_meters(String heat_shields_size_meters) {
		this.heat_shields_size_meters = heat_shields_size_meters;
	}
	public String getHeat_shields_temp_degrees() {
		return heat_shields_temp_degrees;
	}
	public void setHeat_shields_temp_degrees(String heat_shields_temp_degrees) {
		this.heat_shields_temp_degrees = heat_shields_temp_degrees;
	}
	public String getHeat_shields_dev_partner() {
		return heat_shields_dev_partner;
	}
	public void setHeat_shields_dev_partner(String heat_shields_dev_partner) {
		this.heat_shields_dev_partner = heat_shields_dev_partner;
	}
	public ArrayList<Thrusters> getThrusters() {
		return thrusters;
	}
	public void setThrusters(ArrayList<Thrusters> thrusters) {
		this.thrusters = thrusters;
	}
	public String getLaunch_payload_mass_kg() {
		return launch_payload_mass_kg;
	}
	public void setLaunch_payload_mass_kg(String launch_payload_mass_kg) {
		this.launch_payload_mass_kg = launch_payload_mass_kg;
	}
	public String getLaunch_payload_mass_lb() {
		return launch_payload_mass_lb;
	}
	public void setLaunch_payload_mass_lb(String launch_payload_mass_lb) {
		this.launch_payload_mass_lb = launch_payload_mass_lb;
	}
	public String getLaunch_payload_vol_cubic_meters() {
		return launch_payload_vol_cubic_meters;
	}
	public void setLaunch_payload_vol_cubic_meters(String launch_payload_vol_cubic_meters) {
		this.launch_payload_vol_cubic_meters = launch_payload_vol_cubic_meters;
	}
	public String getLaunch_payload_vol_cubic_feet() {
		return launch_payload_vol_cubic_feet;
	}
	public void setLaunch_payload_vol_cubic_feet(String launch_payload_vol_cubic_feet) {
		this.launch_payload_vol_cubic_feet = launch_payload_vol_cubic_feet;
	}
	public String getReturn_payload_mass_kg() {
		return return_payload_mass_kg;
	}
	public void setReturn_payload_mass_kg(String return_payload_mass_kg) {
		this.return_payload_mass_kg = return_payload_mass_kg;
	}
	public String getReturn_payload_mass_lb() {
		return return_payload_mass_lb;
	}
	public void setReturn_payload_mass_lb(String return_payload_mass_lb) {
		this.return_payload_mass_lb = return_payload_mass_lb;
	}
	public String getReturn_payload_vol_cubic_meters() {
		return return_payload_vol_cubic_meters;
	}
	public void setReturn_payload_vol_cubic_meters(String return_payload_vol_cubic_meters) {
		this.return_payload_vol_cubic_meters = return_payload_vol_cubic_meters;
	}
	public String getReturn_payload_vol_cubic_feet() {
		return return_payload_vol_cubic_feet;
	}
	public void setReturn_payload_vol_cubic_feet(String return_payload_vol_cubic_feet) {
		this.return_payload_vol_cubic_feet = return_payload_vol_cubic_feet;
	}
	public String getPressurized_capsule_payload_volume_cubic_meters() {
		return pressurized_capsule_payload_volume_cubic_meters;
	}
	public void setPressurized_capsule_payload_volume_cubic_meters(String pressurized_capsule_payload_volume_cubic_meters) {
		this.pressurized_capsule_payload_volume_cubic_meters = pressurized_capsule_payload_volume_cubic_meters;
	}
	public String getPressurized_capsule_payload_volume_cubic_feet() {
		return pressurized_capsule_payload_volume_cubic_feet;
	}
	public void setPressurized_capsule_payload_volume_cubic_feet(String pressurized_capsule_payload_volume_cubic_feet) {
		this.pressurized_capsule_payload_volume_cubic_feet = pressurized_capsule_payload_volume_cubic_feet;
	}
	public String getTrunk_trunk_volume_cubic_meters() {
		return trunk_trunk_volume_cubic_meters;
	}
	public void setTrunk_trunk_volume_cubic_meters(String trunk_trunk_volume_cubic_meters) {
		this.trunk_trunk_volume_cubic_meters = trunk_trunk_volume_cubic_meters;
	}
	public String getTrunk_trunk_volume_cubic_feet() {
		return trunk_trunk_volume_cubic_feet;
	}
	public void setTrunk_trunk_volume_cubic_feet(String trunk_trunk_volume_cubic_feet) {
		this.trunk_trunk_volume_cubic_feet = trunk_trunk_volume_cubic_feet;
	}
	public String getTrunk_cargo_solar_array() {
		return trunk_cargo_solar_array;
	}
	public void setTrunk_cargo_solar_array(String trunk_cargo_solar_array) {
		this.trunk_cargo_solar_array = trunk_cargo_solar_array;
	}
	public String getTrunk_cargo_unpressurized_cargo() {
		return trunk_cargo_unpressurized_cargo;
	}
	public void setTrunk_cargo_unpressurized_cargo(String trunk_cargo_unpressurized_cargo) {
		this.trunk_cargo_unpressurized_cargo = trunk_cargo_unpressurized_cargo;
	}
	public String getHeight_w_trunk_meters() {
		return height_w_trunk_meters;
	}
	public void setHeight_w_trunk_meters(String height_w_trunk_meters) {
		this.height_w_trunk_meters = height_w_trunk_meters;
	}
	public String getHeight_w_trunk_feet() {
		return height_w_trunk_feet;
	}
	public void setHeight_w_trunk_feet(String height_w_trunk_feet) {
		this.height_w_trunk_feet = height_w_trunk_feet;
	}
	public String getDiameter_meters() {
		return diameter_meters;
	}
	public void setDiameter_meters(String diameter_meters) {
		this.diameter_meters = diameter_meters;
	}
	public String getDiameter_feet() {
		return diameter_feet;
	}
	public void setDiameter_feet(String diameter_feet) {
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
