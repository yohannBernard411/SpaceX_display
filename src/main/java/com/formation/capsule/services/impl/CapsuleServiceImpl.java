package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.CapsuleAPIDAO;
import com.formation.capsule.models.Capsule;
import com.formation.capsule.services.CapsuleService;

@Service
public class CapsuleServiceImpl implements CapsuleService {
	
	@Autowired
	public CapsuleAPIDAO capsuleAPIDAO;
	
	@Override
	public Capsule[] getListeCapsules() {
		Capsule[] reponse = capsuleAPIDAO.getListeCapsules();
		return reponse;
	}

}
