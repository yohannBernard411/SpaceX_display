package com.formation.capsule.models;

public class LaunchSite {
	
	private Site site;
	private Boolean launch_success;
	
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public Boolean getLaunch_success() {
		return launch_success;
	}
	public void setLaunch_success(Boolean launch_success) {
		this.launch_success = launch_success;
	}

}
