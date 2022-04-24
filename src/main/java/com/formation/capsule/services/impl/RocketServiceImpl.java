package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.RocketAPIDAO;
import com.formation.capsule.models.Rocket2;
import com.formation.capsule.services.RocketService;

@Service
public class RocketServiceImpl implements RocketService {
	
	@Autowired
	public RocketAPIDAO rocketAPIDAO;

	@Override
	public Rocket2[] getListeRockets() {
		Rocket2[] reponse = rocketAPIDAO.getListeRockets();
		return reponse;
	}

}
