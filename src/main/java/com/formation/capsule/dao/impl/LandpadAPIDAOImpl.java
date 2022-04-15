package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.LandpadAPIDAO;
import com.formation.capsule.dao.entity.ReponseLandpadAPIEntity;
import com.formation.capsule.models.Landpad;

@Repository
public class LandpadAPIDAOImpl implements LandpadAPIDAO {

	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/landpads";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Landpad[] getListeLandpads() {
		// TODO Auto-generated method stub
		return restTemplate.getForEntity(URL_API_OPEN_DATA, Landpad[].class).getBody();
	}

}
