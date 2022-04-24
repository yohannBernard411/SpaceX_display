package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Roadster;
import com.formation.capsule.services.RoadsterService;

@RestController
public class RoadsterController {
	
	@Autowired
	private RoadsterService roadsterService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/roadster", method=RequestMethod.GET)
	public Roadster getRoadster(){
		
		return roadsterService.getRoadster();
	}

}
