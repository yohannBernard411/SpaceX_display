package com.formation.capsule.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.DragonAPIDAO;
import com.formation.capsule.dao.emtity.ReponseDragonAPIEntity;
import com.formation.capsule.models.Dragon;
import com.formation.capsule.models.Thrusters;
import com.formation.capsule.services.DragonService;

@Service
public class DragonServiceImpl implements DragonService {
	
	@Autowired
	public DragonAPIDAO dragonAPIDAO;


	@Override
    public List<Dragon> getListeDragons(){
		ArrayList<ReponseDragonAPIEntity> reponse = dragonAPIDAO.getListeDragons();
		return transformEntityToModel(reponse);
	}


	private List<Dragon> transformEntityToModel(ArrayList<ReponseDragonAPIEntity> reponse) {
		List<Dragon> resultat = new ArrayList<Dragon>();
		for(ArrayList<ReponseDragonAPIEntity> record: reponse){
			Dragon dragon = new Dragon();
			dragon.setId(record.id);
		}
		return resultat;
	}

}
