package com.projet.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.projet.entity.Hauteur;
import com.projet.entity.Portee;
import com.projet.entity.Utilisateur;

public interface HauteurService {
	
	public float calculerHauteur(Hauteur h) throws Exception;
	
	
	
}
