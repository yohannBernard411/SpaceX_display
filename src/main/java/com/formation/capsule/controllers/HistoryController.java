package com.formation.capsule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.History;
import com.formation.capsule.services.HistoryService;

@RestController
public class HistoryController {
	
	@Autowired
	private HistoryService historyService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/historys", method=RequestMethod.GET)
	public History[] getListeHistorys(){
		
		return historyService.getListeHistorys();
	}

}
