package com.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.ContinueJumelleDAO;
import com.projet.dao.ContinueSimpleDAO;
import com.projet.dao.IsostatiqueJumelleDAO;
import com.projet.dao.IsostatiqueSimpleDAO;
import com.projet.dao.UserDAO;
import com.projet.entity.Portee;
import com.projet.entity.Utilisateur;

@Service
public class PorteeServiceImpl implements PorteeService {
	
	
	@Autowired
	private ContinueJumelleDAO cjDAO;
	@Autowired
	private ContinueSimpleDAO csDAO;
	@Autowired
	private IsostatiqueJumelleDAO ijDAO;
	@Autowired
	private IsostatiqueSimpleDAO isDAO;
	
	
	@Override
	@Transactional
	public List<Float> calculerPortee(int epaisseurX, int epaisseurY, int numeroCharge) {
		List<Float> result = new ArrayList<Float>();
		result.add(cjDAO.calculerPortee(epaisseurX, epaisseurY, numeroCharge));
		result.add(csDAO.calculerPortee(epaisseurX, epaisseurY, numeroCharge));
		result.add(ijDAO.calculerPortee(epaisseurX, epaisseurY, numeroCharge));
		result.add(isDAO.calculerPortee(epaisseurX, epaisseurY, numeroCharge));
		
		return result;
	}


	@Override
	public int getEpaisseurY(int epaisseurX,Portee p) {
		switch(epaisseurX) {
		case 12 : return p.getEpaisseur12();
		case 16 : return p.getEpaisseur16();
		case 20 : return p.getEpaisseur20();
		case 25 : return p.getEpaisseur25();
		case 30 : return p.getEpaisseur30();
		}
		return 0;
	}


	@Override
	public int chargeColumn(String charge) {
		switch (charge) {
    	case "150": return 0; 
    	case "250" : return 1; 
    	case "400" : return 2; 
    	case "500" :return 3; 
    	case "150/T" :return 4; 
    	case "100/T": return 5; 
    }
		return 0;
	}

}
