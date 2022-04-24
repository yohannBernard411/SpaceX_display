package com.formation.capsule.models;

public class Ship {

	private String ship_id;
	private String ship_name;
	private String ship_model;
	private String ship_type;
	private String[] roles;
	private Boolean active;
	private Number imo;
	private Number mmsi;
	private Number abs;
	private Number classe;
	private Number weight_lbs;
	private Number weight_kg;
	private Number year_built;
	private String home_port;
	private String status;
	private String speed_kn;
	private String course_deg;
	private Position position;
	private String successful_landings;
	private String attempted_landings;
	private Mission[] mission;
	private String url;
	private String image;
	
	public String getShip_id() {
		return ship_id;
	}
	public void setShip_id(String ship_id) {
		this.ship_id = ship_id;
	}
	public String getShip_name() {
		return ship_name;
	}
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	public String getShip_model() {
		return ship_model;
	}
	public void setShip_model(String ship_model) {
		this.ship_model = ship_model;
	}
	public String getShip_type() {
		return ship_type;
	}
	public void setShip_type(String ship_type) {
		this.ship_type = ship_type;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Number getImo() {
		return imo;
	}
	public void setImo(Number imo) {
		this.imo = imo;
	}
	public Number getMmsi() {
		return mmsi;
	}
	public void setMmsi(Number mmsi) {
		this.mmsi = mmsi;
	}
	public Number getAbs() {
		return abs;
	}
	public void setAbs(Number abs) {
		this.abs = abs;
	}
	public Number getClasse() {
		return classe;
	}
	public void setClasse(Number classe) {
		this.classe = classe;
	}
	public Number getWeight_lbs() {
		return weight_lbs;
	}
	public void setWeight_lbs(Number weight_lbs) {
		this.weight_lbs = weight_lbs;
	}
	public Number getWeight_kg() {
		return weight_kg;
	}
	public void setWeight_kg(Number weight_kg) {
		this.weight_kg = weight_kg;
	}
	public Number getYear_built() {
		return year_built;
	}
	public void setYear_built(Number year_built) {
		this.year_built = year_built;
	}
	public String getHome_port() {
		return home_port;
	}
	public void setHome_port(String home_port) {
		this.home_port = home_port;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpeed_kn() {
		return speed_kn;
	}
	public void setSpeed_kn(String speed_kn) {
		this.speed_kn = speed_kn;
	}
	public String getCourse_deg() {
		return course_deg;
	}
	public void setCourse_deg(String course_deg) {
		this.course_deg = course_deg;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getSuccessful_landings() {
		return successful_landings;
	}
	public void setSuccessful_landings(String successful_landings) {
		this.successful_landings = successful_landings;
	}
	public String getAttempted_landings() {
		return attempted_landings;
	}
	public void setAttempted_landings(String attempted_landings) {
		this.attempted_landings = attempted_landings;
	}
	public Mission[] getMission() {
		return mission;
	}
	public void setMission(Mission[] mission) {
		this.mission = mission;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
