package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.RocketAPIDAO;
import com.formation.capsule.models.Rocket2;

@Repository
public class RocketAPIDAOImpl implements RocketAPIDAO {
	
	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/rockets";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Rocket2[] getListeRockets() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Rocket2[].class).getBody();
	}

}
