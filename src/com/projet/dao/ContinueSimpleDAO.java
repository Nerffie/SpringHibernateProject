package com.projet.dao;

import java.util.ArrayList;
import java.util.List;

import com.projet.entity.Utilisateur;



public interface ContinueSimpleDAO {
	
	public float calculerPortee( int epaisseurX,int epaisseurY, int numeroCharge );
	public ArrayList<ArrayList<Integer>> calculerEpaisseur(float portee, int numeroCharge);

}
