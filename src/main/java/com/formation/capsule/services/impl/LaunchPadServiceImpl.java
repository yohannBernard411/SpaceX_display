package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.LaunchPadAPIDAO;
import com.formation.capsule.models.LaunchPad;
import com.formation.capsule.services.LaunchPadService;

@Service
public class LaunchPadServiceImpl implements LaunchPadService {
	
	@Autowired
	public LaunchPadAPIDAO launchpadAPIDAO;
	
	@Override
	public LaunchPad[] getListeLaunchPads() {
		LaunchPad[] reponse = launchpadAPIDAO.getListeLaunchPads();
		return reponse;
	}

}
