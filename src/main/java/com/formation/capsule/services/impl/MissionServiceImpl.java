package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.MissionAPIDAO;
import com.formation.capsule.models.Mission2;
import com.formation.capsule.services.MissionService;

@Service
public class MissionServiceImpl implements MissionService {
	
	@Autowired
	public MissionAPIDAO missionAPIDAO;

	@Override
	public Mission2[] getListeMissions() {
		Mission2[] reponse = missionAPIDAO.getListeMissions();
		return reponse;
	}

}
