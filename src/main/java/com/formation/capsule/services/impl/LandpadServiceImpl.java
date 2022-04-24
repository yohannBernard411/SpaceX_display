package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.LandpadAPIDAO;
import com.formation.capsule.models.Landpad;
import com.formation.capsule.services.LandpadService;

@Service
public class LandpadServiceImpl implements LandpadService {
	
	@Autowired
	public LandpadAPIDAO landpadAPIDAO;

	@Override
	public Landpad[] getListeLandpads() {
		Landpad[] reponse = landpadAPIDAO.getListeLandpads();
		return reponse;
	}

}
