package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Rocket2;
import com.formation.capsule.services.RocketService;

@RestController
public class RocketController {
	
	@Autowired
	private RocketService rocketService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/rockets", method=RequestMethod.GET)
    public Rocket2[] getListeRockets(){
		
		return rocketService.getListeRockets();
	}

}
