package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.LaunchAPIDAO;
import com.formation.capsule.models.Launch;

@Repository
public class LaunchAPIDAOImpl implements LaunchAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/launches";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Launch[] getListeLaunches() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Launch[].class).getBody();
	}

}
