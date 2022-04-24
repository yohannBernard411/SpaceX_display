package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.DragonAPIDAO;
import com.formation.capsule.models.Dragon;
import com.formation.capsule.services.DragonService;

@Service
public class DragonServiceImpl implements DragonService {
	
	@Autowired
	public DragonAPIDAO dragonAPIDAO;
	
	@Override
	public Dragon[] getListeDragons() {
		Dragon[] reponse = dragonAPIDAO.getListeDragons();
		return reponse;
	}

}
