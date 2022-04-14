package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.HistoryAPIDAO;
import com.formation.capsule.models.History;
import com.formation.capsule.services.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	public HistoryAPIDAO historyAPIDAO;
	
	@Override
	public History[] getListeHistorys() {
		History[] reponse = historyAPIDAO.getListeHistorys();
		return reponse;
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


return historyList;
*/
