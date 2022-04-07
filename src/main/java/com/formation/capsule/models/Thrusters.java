package com.formation.capsule.models;

public class Thrusters {
	
	private String type;
	private Number amount;
	private Number pods;
	private String fuel_1;
	private String fuel_2;
	private Number isp;
	private Number thrust_kN;
	private Number thrust_lbf;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Number getAmount() {
		return amount;
	}
	public void setAmount(Number amount) {
		this.amount = amount;
	}
	public Number getPods() {
		return pods;
	}
	public void setPods(Number pods) {
		this.pods = pods;
	}
	public String getFuel_1() {
		return fuel_1;
	}
	public void setFuel_1(String fuel_1) {
		this.fuel_1 = fuel_1;
	}
	public String getFuel_2() {
		return fuel_2;
	}
	public void setFuel_2(String fuel_2) {
		this.fuel_2 = fuel_2;
	}
	public Number getIsp() {
		return isp;
	}
	public void setIsp(Number isp) {
		this.isp = isp;
	}
	public Number getThrust_kN() {
		return thrust_kN;
	}
	public void setThrust_kN(Number thrust_kN) {
		this.thrust_kN = thrust_kN;
	}
	public Number getThrust_lbf() {
		return thrust_lbf;
	}
	public void setThrust_lbf(Number thrust_lbf) {
		this.thrust_lbf = thrust_lbf;
	}

}
