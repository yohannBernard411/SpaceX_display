package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.DragonAPIDAO;
import com.formation.capsule.dao.emtity.ReponseDragonAPIEntity;

@Repository
public class DragonAPIDAOIpml implements DragonAPIDAO {
	
	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/dragons";
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ReponseDragonAPIEntity getListeDragons() {
		
		return restTemplate.getForEntity( URL_API_OPEN_DATA, ReponseDragonAPIEntity.class).getBody();
	}

}
