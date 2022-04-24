package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Launch;
import com.formation.capsule.services.LaunchService;

@RestController
public class LaunchController {
	
	@Autowired
	private LaunchService launchService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path = "/api/launches", method = RequestMethod.GET)
	public Launch[] getListeLanches(){

		return launchService.getListeLaunches();
	}

}
