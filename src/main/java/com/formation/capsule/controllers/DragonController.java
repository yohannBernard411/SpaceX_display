package com.formation.capsule.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Dragon;
import com.formation.capsule.services.DragonService;

@RestController
public class DragonController {
	
	@Autowired
	private DragonService dragonService;
	
	@RequestMapping(path= "/api/dragons", method=RequestMethod.GET)
	public List<Dragon> getListeDragons() {
		
		return dragonService.getListeDragons();
	}
	
}
