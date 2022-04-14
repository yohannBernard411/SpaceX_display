package com.formation.capsule.models;

public class History {
	
	private Number id;
	private String title;
	private String event_date_utc;
	private Number event_date_unix;
	private Number flight_number;
	private String details;
	private Links links;
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEvent_date_utc() {
		return event_date_utc;
	}
	public void setEvent_date_utc(String event_date_utc) {
		this.event_date_utc = event_date_utc;
	}
	public Number getEvent_date_unix() {
		return event_date_unix;
	}
	public void setEvent_date_unix(Number event_date_unix) {
		this.event_date_unix = event_date_unix;
	}
	public Number getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(Number flight_number) {
		this.flight_number = flight_number;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	
	
	
		
}
