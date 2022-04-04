package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Capsule;
import com.formation.capsule.services.CapsuleService;

@RestController
public class CapsuleController {
	
	@Autowired
	private CapsuleService capsuleService;
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(path= "/api/capsules", method=RequestMethod.GET)
	public Capsule[] getListeCapsules(){
		
		return capsuleService.getListeCapsules();
	}

}
