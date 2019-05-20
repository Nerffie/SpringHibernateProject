package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.entity.Utilisateur;

@Repository
public class UserDAPImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Utilisateur> getUsers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		Query<Utilisateur> q = session.createQuery("from User", Utilisateur.class);
		List<Utilisateur> users = q.getResultList();
		return users;
	}

	@Override
	public void saveUser(Utilisateur u) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		session.saveOrUpdate(u);
		
	}

	@Override
	public Utilisateur getUser(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		Utilisateur user =  session.get(Utilisateur.class, id);;
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("delete from User where iduser= :userid");
		q.setParameter("userid", id);
		q.executeUpdate();
	}
	
	
	

}
