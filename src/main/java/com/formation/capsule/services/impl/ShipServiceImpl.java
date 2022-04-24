package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.ShipAPIDAO;
import com.formation.capsule.models.Ship;
import com.formation.capsule.services.ShipService;

@Service
public class ShipServiceImpl implements ShipService {
	
	@Autowired
	public ShipAPIDAO shipAPIDAO;
	
	@Override
	public Ship[] getListeShips() {
		Ship[] reponse = shipAPIDAO.getListeShips();
		return reponse;
	}

}
