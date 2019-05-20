package com.projet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.ContinueJumelleDAO;
import com.projet.dao.LitrageDAO;
import com.projet.entity.Hauteur;
import com.projet.entity.Litrage;


@Service
public class LitrageServiceImpl implements LitrageService {

	@Autowired
	private LitrageDAO lDAO;
	
	@Override
	@Transactional
	public float calculerLitrage(Litrage l) {
		// TODO Auto-generated method stub
		
		return lDAO.calculerLitrage(l);
	}

	

}
