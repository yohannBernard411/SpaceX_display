package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.CoreAPIDAO;
import com.formation.capsule.models.Core;

@Repository
public class CoreAPIDAOImpl implements CoreAPIDAO{
	
	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/cores";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Core[] getListeCores() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Core[].class).getBody();
	}

}
