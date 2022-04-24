package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Core;
import com.formation.capsule.services.CoreService;

@RestController
public class CoreController {
	
	@Autowired
	private CoreService coreService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/cores", method=RequestMethod.GET)
	public Core[] getListeCores(){
		
		return coreService.getListeCores();
	}

}
