package com.formation.capsule.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.LaunchAPIDAO;
import com.formation.capsule.models.Launch;
import com.formation.capsule.services.LaunchService;

@Service
public class LaunchServiceImpl implements LaunchService {
	
	@Autowired
	public LaunchAPIDAO launchAPIDAO;

	@Override
	public Launch[] getListeLaunches() {

		Launch[] reponse = launchAPIDAO.getListeLaunches();
		return reponse;
	}

}
