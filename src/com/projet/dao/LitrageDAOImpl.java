package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.projet.service.Mail;
import com.projet.entity.Litrage;
import com.projet.entity.Utilisateur;

@Repository
public class LitrageDAOImpl implements LitrageDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public float calculerLitrage(Litrage l) {
		Session session = sessionFactory.getCurrentSession();
		Query<Float> q = session.createQuery("select consommation from Litrage where epaisseurX = :X and epaisseurY = :Y",Float.class);
		q.setParameter("X", l.getEpaisseurX());
		q.setParameter("Y", l.getEpaisseurY());
		Float result = q.getResultList().get(0);
		return l.getSuperficie()*result;
	}
	
	
	

}
