package com.formation.capsule.models;

public class HeatShield {
	
	private String material;
	private Number size_meters;
	private Number temp_degrees;
	private String dev_partner;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Number getSize_meters() {
		return size_meters;
	}
	public void setSize_meters(Number size_meters) {
		this.size_meters = size_meters;
	}
	public Number getTemp_degrees() {
		return temp_degrees;
	}
	public void setTemp_degrees(Number temp_degrees) {
		this.temp_degrees = temp_degrees;
	}
	public String getDev_partner() {
		return dev_partner;
	}
	public void setDev_partner(String dev_partner) {
		this.dev_partner = dev_partner;
	}
	
	

}
