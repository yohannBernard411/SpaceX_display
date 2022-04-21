package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.LaunchPadAPIDAO;
import com.formation.capsule.models.LaunchPad;

@Repository
public class LaunchPadAPIDAOImpl implements LaunchPadAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/launchpads";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public LaunchPad[] getListeLaunchPads() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, LaunchPad[].class).getBody();
	}

}
