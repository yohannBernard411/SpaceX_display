package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Ship;
import com.formation.capsule.services.ShipService;

@RestController
public class ShipController {

	@Autowired
	private ShipService shipService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/ships", method=RequestMethod.GET)
	public Ship[] getListeShips(){
		
		return shipService.getListeShips();
	}

}
