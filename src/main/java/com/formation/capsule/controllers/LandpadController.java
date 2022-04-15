package com.formation.capsule.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Landpad;
import com.formation.capsule.models.Location;
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
		
		/*
		Landpad landpadTest = new Landpad();
		landpadTest.setId("LZ-1");
		landpadTest.setFull_name("Landing Zone 1");
		landpadTest.setStatus("active");
		
		Location locationTest = new Location();
		locationTest.setName("Cape Canaveral");
		locationTest.setRegion("Florida");
		locationTest.setLatitude(28.485833);
		locationTest.setLongitude(-80.544444);
		
		landpadTest.setLocation(locationTest);
		landpadTest.setLanding_type("RTLS");
		landpadTest.setAttempted_landings(16);
        landpadTest.setSuccessful_landings(15);
        landpadTest.setWikipedia("https://en.wikipedia.org/wiki/Landing_Zones_1_and_2");
        landpadTest.setDetails("SpaceX's first east coast landing pad is Landing Zone 1, where the historic first Falcon 9 landing occurred in December 2015. LC-13 was originally used as a launch pad for early Atlas missiles and rockets from Lockheed Martin. LC-1 was later expanded to include Landing Zone 2 for side booster RTLS Falcon Heavy missions, and it was first used in February 2018 for that purpose.");
		
        ArrayList<Landpad> liste = new ArrayList<Landpad>();
        liste.add(landpadTest);
        
        return liste;
        */
	
