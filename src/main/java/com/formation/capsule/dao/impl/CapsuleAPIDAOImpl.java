package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.CapsuleAPIDAO;
import com.formation.capsule.models.Capsule;

@Repository
public class CapsuleAPIDAOImpl implements CapsuleAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/capsules";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Capsule[] getListeCapsules() {
		return restTemplate.getForObject(URL_API_OPEN_DATA, Capsule[].class);
	}

}
