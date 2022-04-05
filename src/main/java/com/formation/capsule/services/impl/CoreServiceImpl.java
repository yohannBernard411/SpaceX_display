package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.CapsuleAPIDAO;
import com.formation.capsule.dao.CoreAPIDAO;
import com.formation.capsule.models.Capsule;
import com.formation.capsule.models.Core;
import com.formation.capsule.services.CapsuleService;
import com.formation.capsule.services.CoreService;

@Service
public class CoreServiceImpl implements CoreService {
	
	@Autowired
	public CoreAPIDAO coreAPIDAO;
	
	@Override
	public Core[] getListeCores() {
		Core[] reponse = coreAPIDAO.getListeCores();
		return reponse;
	}

}
