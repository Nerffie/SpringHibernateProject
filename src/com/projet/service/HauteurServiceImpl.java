package com.projet.service;

import org.springframework.stereotype.Service;

import com.projet.entity.Hauteur;


@Service
public class HauteurServiceImpl implements HauteurService {

	@Override
	public float calculerHauteur(Hauteur h) throws Exception {
		if (h.getFp()<h.getGaine()+5) {
			throw new Exception();
		}
		
		return h.getHspb()-h.getFp()-h.getEpaisseurRev()-5;
				
		
	}

}
