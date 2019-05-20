package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.projet.service.Mail;
import com.projet.entity.Utilisateur;

@Repository
public class UserDAOPImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Utilisateur> getUsers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		Query<Utilisateur> q = session.createQuery("from Utilisateur", Utilisateur.class);
		List<Utilisateur> users = q.getResultList();
		return users;
	}

	@Override
	public void saveUser(Utilisateur u) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
	    passwordEncryptor.setAlgorithm( "SHA-256" );
	    passwordEncryptor.setPlainDigest( false );
	    
	    String valide_hash = passwordEncryptor.encryptPassword(u.getEmail()+u.getNom()+u.getPrenom());
	    u.setValideHash(valide_hash);
	    
	    long millis=System.currentTimeMillis();  
	    java.sql.Date date= new java.sql.Date(millis);  
	    
	    u.setDateInscription(date);
	    String motDePasseChiffre = passwordEncryptor.encryptPassword( u.getMotDePasse() );
	    u.setMotDePasse( motDePasseChiffre );

		
		
		session.saveOrUpdate(u);
		//new Mail(u).sendMail();
		
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

	@Override
	public Utilisateur getUserByEmail(String email) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Utilisateur> q = session.createQuery("from Utilisateur where email = :emailparam",Utilisateur.class);
		q.setParameter("emailparam", email);
		List<Utilisateur> user = q.getResultList();
		
		if (user.isEmpty()) {return null;}
		return user.get(0);
	}
	
	public boolean passwordMatch(String motDePasse,Utilisateur user) {
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
	    passwordEncryptor.setAlgorithm( "SHA-256");
	    passwordEncryptor.setPlainDigest( false );
	    String motDePasseHash = user.getMotDePasse();
	     if(!passwordEncryptor.checkPassword(motDePasse, motDePasseHash)) {
	    	 return false;
	     }
		return true;
		
	}

	@Override
	public void updateConnexion(Utilisateur user) {
		Session session = sessionFactory.getCurrentSession();
		//Query<Utilisateur> q = session.createQuery("update Utilisateur set where email = :emailparam",Utilisateur.class);
		
		long millis=System.currentTimeMillis();  
	    java.sql.Date date= new java.sql.Date(millis);  
	    
	    user.setDateConnexion(date);
		
	    session.saveOrUpdate(user);
		
	}
	
	
	

}
