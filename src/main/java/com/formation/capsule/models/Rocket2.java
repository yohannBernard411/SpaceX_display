package com.formation.capsule.models;

import java.util.ArrayList;

public class Rocket2 {
	
	private Number id;
	private Boolean active;
	private Number stages;
	private Number boosters;
	private Number cost_per_launch;
	private Number success_rate_pct;
	private String first_flight;
	private String country;
	private String company;
	private Height height;
	private Diameter diameter;
	private Mass mass;
	private ArrayList<Payload_weights> payload_weights;
	private FirstStage2 first_stage;
	private SecondStage2 second_stage;
	private Engines engines;
	private LandingLegs landing_legs;
	private String[] flickr_images;
	private String wikipedia;
	private String description;
	private String rocket_id;
	private String rocket_name;
	private String rocket_type;
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Number getStages() {
		return stages;
	}
	public void setStages(Number stages) {
		this.stages = stages;
	}
	public Number getBoosters() {
		return boosters;
	}
	public void setBoosters(Number boosters) {
		this.boosters = boosters;
	}
	public Number getCost_per_launch() {
		return cost_per_launch;
	}
	public void setCost_per_launch(Number cost_per_launch) {
		this.cost_per_launch = cost_per_launch;
	}
	public Number getSuccess_rate_pct() {
		return success_rate_pct;
	}
	public void setSuccess_rate_pct(Number success_rate_pct) {
		this.success_rate_pct = success_rate_pct;
	}
	public String getFirst_flight() {
		return first_flight;
	}
	public void setFirst_flight(String first_flight) {
		this.first_flight = first_flight;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Height getHeight() {
		return height;
	}
	public void setHeight(Height height) {
		this.height = height;
	}
	public Diameter getDiameter() {
		return diameter;
	}
	public void setDiameter(Diameter diameter) {
		this.diameter = diameter;
	}
	public Mass getMass() {
		return mass;
	}
	public void setMass(Mass mass) {
		this.mass = mass;
	}
	public ArrayList<Payload_weights> getPayload_weights() {
		return payload_weights;
	}
	public void setPayload_weights(ArrayList<Payload_weights> payload_weights) {
		this.payload_weights = payload_weights;
	}
	public FirstStage2 getFirst_stage() {
		return first_stage;
	}
	public void setFirst_stage(FirstStage2 first_stage) {
		this.first_stage = first_stage;
	}
	public SecondStage2 getSecond_stage() {
		return second_stage;
	}
	public void setSecond_stage(SecondStage2 second_stage) {
		this.second_stage = second_stage;
	}
	public Engines getEngines() {
		return engines;
	}
	public void setEngines(Engines engines) {
		this.engines = engines;
	}
	public LandingLegs getLanding_legs() {
		return landing_legs;
	}
	public void setLanding_legs(LandingLegs landing_legs) {
		this.landing_legs = landing_legs;
	}
	public String[] getFlickr_images() {
		return flickr_images;
	}
	public void setFlickr_images(String[] flickr_images) {
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
	public String getRocket_id() {
		return rocket_id;
	}
	public void setRocket_id(String rocket_id) {
		this.rocket_id = rocket_id;
	}
	public String getRocket_name() {
		return rocket_name;
	}
	public void setRocket_name(String rocket_name) {
		this.rocket_name = rocket_name;
	}
	public String getRocket_type() {
		return rocket_type;
	}
	public void setRocket_type(String rocket_type) {
		this.rocket_type = rocket_type;
	}
	
}
