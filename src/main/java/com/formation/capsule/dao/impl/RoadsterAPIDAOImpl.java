package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.RoadsterAPIDAO;
import com.formation.capsule.models.Roadster;

@Repository
public class RoadsterAPIDAOImpl implements RoadsterAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/roadster";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Roadster getRoadster() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Roadster.class).getBody();
	}

}
