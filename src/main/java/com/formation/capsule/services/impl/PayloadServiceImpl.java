package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.PayloadAPIDAO;
import com.formation.capsule.models.Payload;
import com.formation.capsule.services.PayloadService;

@Service
public class PayloadServiceImpl implements PayloadService {
	
	@Autowired
	public PayloadAPIDAO payloadAPIDAO;

	@Override
	public Payload[] getListePayloads() {
		Payload[] reponse = payloadAPIDAO.getListePayloads();
		return reponse;
	}

}
