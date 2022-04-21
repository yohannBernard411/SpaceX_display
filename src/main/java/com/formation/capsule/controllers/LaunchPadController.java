package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.LaunchPad;
import com.formation.capsule.services.LaunchPadService;

@RestController
public class LaunchPadController {
		
		@Autowired
		private LaunchPadService launchPadService;
		
		@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
		@RequestMapping(path = "/api/launchpads", method = RequestMethod.GET)
		public LaunchPad[] getListeLanchPads(){
			return launchPadService.getListeLaunchPads();
		}

    }
