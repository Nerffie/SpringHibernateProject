package com.projet.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.entity.ContinueJumelle;
import com.projet.entity.Utilisateur;


@Repository
public class ContinueJumelleDAOImpl implements ContinueJumelleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public float calculerPortee(int epaisseurX, int epaisseurY, int numeroCharge) {
		Session session = sessionFactory.getCurrentSession();
		String[] queries = {"SELECT charge_150 from Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_250 FROM Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_400 FROM Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_500 FROM Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_150T FROM Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_100T FROM Continuejumelle WHERE epaisseurX = :X and epaisseurY = :Y"};
		Query<ContinueJumelle> q = session.createQuery(queries[numeroCharge], ContinueJumelle.class);
		q.setParameter("X", epaisseurX);
		q.setParameter("Y", epaisseurY);
		
		List<ContinueJumelle> resultat = q.getResultList();
		return 0;
	}

	@Override
	public ArrayList<ArrayList<Integer>> calculerEpaisseur(float portee, int numeroCharge) {
		// TODO Auto-generated method stub
		return null;
	}

}
