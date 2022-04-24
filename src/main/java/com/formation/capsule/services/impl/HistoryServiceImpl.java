package com.formation.capsule.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.capsule.dao.HistoryAPIDAO;
import com.formation.capsule.models.History;
import com.formation.capsule.services.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	public HistoryAPIDAO historyAPIDAO;
	
	@Override
	public History[] getListeHistorys() {
		History[] reponse = historyAPIDAO.getListeHistorys();
		return reponse;
	}

}
