package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.RoadsterAPIDAO;
import com.formation.capsule.models.Roadster;
import com.formation.capsule.services.RoadsterService;

@Service
public class RoadsterServiceImpl implements RoadsterService {
	
	@Autowired
	public RoadsterAPIDAO roadsterAPIDAO;
	
	@Override
	public Roadster getRoadster() {
		Roadster reponse = roadsterAPIDAO.getRoadster();
		return reponse;
	}

}
