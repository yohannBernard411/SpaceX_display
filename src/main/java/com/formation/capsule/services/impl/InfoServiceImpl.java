package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.InfoAPIDAO;
import com.formation.capsule.models.Info;
import com.formation.capsule.services.InfoService;

@Service
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	public InfoAPIDAO infoAPIDAO;
	
	@Override
	public Info getInfos() {
		Info reponse = infoAPIDAO.getInfos();
		return reponse;
	}

}
