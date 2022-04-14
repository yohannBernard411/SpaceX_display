package com.formation.capsule.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.capsule.models.Info;
import com.formation.capsule.services.InfoService;

@RestController
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@CrossOrigin(origins = {"http://localhost:4200", "https://spacexdisplayapp.herokuapp.com"})
	@RequestMapping(path= "/api/info", method=RequestMethod.GET)
	public Info getInfo(){
		
		return infoService.getInfos();
	}

}