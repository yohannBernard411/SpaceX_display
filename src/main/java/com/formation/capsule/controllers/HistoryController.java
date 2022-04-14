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

/*
List<History> historyList = new ArrayList<History>();

Links linksTest = new Links();
linksTest.setReddit(null);
linksTest.setArticle("http://www.spacex.com/news/2013/02/11/flight-4-launch-update-0");
linksTest.setWikipedia("https://en.wikipedia.org/wiki/Falcon_1");

History historyTest = new History();
historyTest.setId(1);
historyTest.setTitle("Falcon 1 Makes History");
historyTest.setEvent_date_utc("2008-09-28T23:15:00Z");
historyTest.setEvent_date_unix(1222643700);
historyTest.setFlight_number(4);
historyTest.setDetails("Falcon 1 becomes the first privately developed liquid fuel rocket to reach Earth orbit.");
historyTest.setLinks(linksTest);
		
historyList.add(historyTest);
*/
