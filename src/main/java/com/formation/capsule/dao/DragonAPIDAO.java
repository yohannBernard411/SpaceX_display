package com.formation.capsule.dao;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formation.capsule.models.Dragon;
import com.formation.capsule.models.Thrusters;

public interface DragonAPIDAO {
	
	public Dragon[] getListeDragons(); 


}
