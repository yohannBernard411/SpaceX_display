package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Dragon;
import com.formation.capsule.services.DragonService;

@RestController
public class DragonController {
	
	@Autowired
	private DragonService dragonService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/dragons", method=RequestMethod.GET)
	public Dragon[] getListeDragons(){
		
		return dragonService.getListeDragons();
	}

}
