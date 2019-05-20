package com.projet.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.projet.entity.Portee;
import com.projet.entity.Utilisateur;

public interface PorteeService {
	
	public List<Float> calculerPortee( int epaisseurX,int epaisseurY, int numeroCharge );
	public int getEpaisseurY(int epaisseurX,Portee p);
	public int chargeColumn(String charge);
	
	
}
