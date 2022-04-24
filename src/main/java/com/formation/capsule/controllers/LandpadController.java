package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Landpad;
import com.formation.capsule.services.LandpadService;

@RestController
public class LandpadController {
	
	@Autowired
	private LandpadService landpadService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path = "/api/landpads", method = RequestMethod.GET)
	public Landpad[] getListeLandpads(){
		
		return landpadService.getListeLandpads();
		}

	}
