package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Mission2;
import com.formation.capsule.services.MissionService;

@RestController
public class MissionController {
	
	@Autowired
	private MissionService missionService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path = "/api/missions", method = RequestMethod.GET)
	public Mission2[] getListeMissions(){
		
		return missionService.getListeMissions();
	     }

}
