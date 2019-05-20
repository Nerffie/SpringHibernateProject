package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.projet.service.Mail;
import com.projet.entity.Admin;
import com.projet.entity.Utilisateur;

@Repository
public class AdminDAOImpl implements AdminDAO{
	
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
	public Admin getAdminById(String id) {
		// TODO Auto-generated method stub
				Session session = sessionFactory.getCurrentSession();
				Query<Admin> q = session.createQuery("from Admin where id = :idparam",Admin.class);
				q.setParameter("idparam", id);
				List<Admin> admin = q.getResultList();
				
				if (admin.isEmpty()) {return null;}
				return admin.get(0);
	}

	@Override
	public boolean passwordMatch(String motDePasse, Admin admin) {
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
	    passwordEncryptor.setAlgorithm( "SHA-256");
	    passwordEncryptor.setPlainDigest( false );
	    String motDePasseHash = admin.getPassword();
	     if(!passwordEncryptor.checkPassword(motDePasse, motDePasseHash)) {
	    	 return false;
	     }
		return true;
	}
	
	
	

}
