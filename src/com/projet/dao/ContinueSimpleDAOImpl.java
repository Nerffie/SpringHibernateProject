package com.projet.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContinueSimpleDAOImpl implements ContinueSimpleDAO{

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public float calculerPortee(int epaisseurX, int epaisseurY, int numeroCharge) {
		Session session = sessionFactory.getCurrentSession();
		String[] queries = {"SELECT charge_150 FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_250 FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_400 FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_500 FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_150T FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y",
				  "SELECT charge_100T FROM Continue_simple WHERE epaisseurX = :X and epaisseurY = :Y"};
		Query<Float> q = session.createQuery(queries[numeroCharge], Float.class);
		q.setParameter("X", epaisseurX);
		q.setParameter("Y", epaisseurY);
		
		List<Float> resultat = q.getResultList();
		return resultat.get(0);
	}

	@Override
	public ArrayList<ArrayList<Integer>> calculerEpaisseur(float portee, int numeroCharge) {
		// TODO Auto-generated method stub
		return null;
	}

}
