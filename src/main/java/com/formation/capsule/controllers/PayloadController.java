package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Payload;
import com.formation.capsule.services.PayloadService;

@RestController
public class PayloadController {
	
	@Autowired
	private PayloadService payloadService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/payloads", method=RequestMethod.GET)
	public Payload[] getListePayloads(){
		
		return payloadService.getListePayloads();
	}

}
