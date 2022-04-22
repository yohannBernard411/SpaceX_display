package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.MissionAPIDAO;
import com.formation.capsule.models.Mission2;

@Repository
public class MissionAPIDAOImpl implements MissionAPIDAO {
	
	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/missions";

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Mission2[] getListeMissions() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Mission2[].class).getBody();
	}

}
