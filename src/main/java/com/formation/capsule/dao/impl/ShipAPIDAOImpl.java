package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.ShipAPIDAO;
import com.formation.capsule.models.Ship;

@Repository
public class ShipAPIDAOImpl implements ShipAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/ships";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Ship[] getListeShips() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Ship[].class).getBody();
	}

}
