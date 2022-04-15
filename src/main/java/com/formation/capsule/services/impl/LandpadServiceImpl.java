package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.LandpadAPIDAO;
import com.formation.capsule.models.Landpad;
import com.formation.capsule.services.LandpadService;

@Service
public class LandpadServiceImpl implements LandpadService {
	
	@Autowired
	public LandpadAPIDAO landpadAPIDAO;

	@Override
	public Landpad[] getListeLandpads() {
		Landpad[] reponse = landpadAPIDAO.getListeLandpads();
		return reponse;
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
	

}
