package com.formation.capsule.models;

import java.util.ArrayList;

public class Launch {

	private Number flight_number;
	private String mission_name;
	private ArrayList<String> mission_id;
	private String launch_year;
	private Number launch_date_unix;
	private String launch_date_utc;
	private String launch_date_local;
	private Boolean is_tentative;
	private String tentative_max_precision;
	private Boolean tbd;
	private Number launch_window;
	private Rocket rocket;
	private ArrayList<String> ships;
	private Telemetry telemetry;
	private LaunchSite launch_site;
	private Boolean launch_success;
	private LinksExt links;
	private String details;
	private Boolean upcoming;
    private String static_fire_date_utc;
    private Number static_fire_date_unix;
    private Timeline timeline;
    private ArrayList<String> crew;
	public Number getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(Number flight_number) {
		this.flight_number = flight_number;
	}
	public String getMission_name() {
		return mission_name;
	}
	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}
	public ArrayList<String> getMission_id() {
		return mission_id;
	}
	public void setMission_id(ArrayList<String> mission_id) {
		this.mission_id = mission_id;
	}
	public String getLaunch_year() {
		return launch_year;
	}
	public void setLaunch_year(String launch_year) {
		this.launch_year = launch_year;
	}
	public Number getLaunch_date_unix() {
		return launch_date_unix;
	}
	public void setLaunch_date_unix(Number launch_date_unix) {
		this.launch_date_unix = launch_date_unix;
	}
	public String getLaunch_date_utc() {
		return launch_date_utc;
	}
	public void setLaunch_date_utc(String launch_date_utc) {
		this.launch_date_utc = launch_date_utc;
	}
	public String getLaunch_date_local() {
		return launch_date_local;
	}
	public void setLaunch_date_local(String launch_date_local) {
		this.launch_date_local = launch_date_local;
	}
	public Boolean getIs_tentative() {
		return is_tentative;
	}
	public void setIs_tentative(Boolean is_tentative) {
		this.is_tentative = is_tentative;
	}
	public String getTentative_max_precision() {
		return tentative_max_precision;
	}
	public void setTentative_max_precision(String tentative_max_precision) {
		this.tentative_max_precision = tentative_max_precision;
	}
	public Boolean getTbd() {
		return tbd;
	}
	public void setTbd(Boolean tbd) {
		this.tbd = tbd;
	}
	public Number getLaunch_window() {
		return launch_window;
	}
	public void setLaunch_window(Number launch_window) {
		this.launch_window = launch_window;
	}
	public Rocket getRocket() {
		return rocket;
	}
	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}
	public ArrayList<String> getShips() {
		return ships;
	}
	public void setShips(ArrayList<String> ships) {
		this.ships = ships;
	}
	public Telemetry getTelemetry() {
		return telemetry;
	}
	public void setTelemetry(Telemetry telemetry) {
		this.telemetry = telemetry;
	}
	public LaunchSite getLaunch_site() {
		return launch_site;
	}
	public void setLaunch_site(LaunchSite launch_site) {
		this.launch_site = launch_site;
	}
	public Boolean getLaunch_success() {
		return launch_success;
	}
	public void setLaunch_success(Boolean launch_success) {
		this.launch_success = launch_success;
	}
	public LinksExt getLinks() {
		return links;
	}
	public void setLinks(LinksExt links) {
		this.links = links;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Boolean getUpcoming() {
		return upcoming;
	}
	public void setUpcoming(Boolean upcoming) {
		this.upcoming = upcoming;
	}
	public String getStatic_fire_date_utc() {
		return static_fire_date_utc;
	}
	public void setStatic_fire_date_utc(String static_fire_date_utc) {
		this.static_fire_date_utc = static_fire_date_utc;
	}
	public Number getStatic_fire_date_unix() {
		return static_fire_date_unix;
	}
	public void setStatic_fire_date_unix(Number static_fire_date_unix) {
		this.static_fire_date_unix = static_fire_date_unix;
	}
	public Timeline getTimeline() {
		return timeline;
	}
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}
	public ArrayList<String> getCrew() {
		return crew;
	}
	public void setCrew(ArrayList<String> crew) {
		this.crew = crew;
	}
	

    
    
}
