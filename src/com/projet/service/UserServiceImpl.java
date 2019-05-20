package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.UserDAO;
import com.projet.entity.Utilisateur;
import com.projet.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	@Transactional
	public List<Utilisateur> getUsers() {
		// TODO Auto-generated method stub
		List<Utilisateur> l =  userDAO.getUsers();
	
		return l;
	}


	@Override
	@Transactional
	public void saveUser(Utilisateur u) {
		// TODO Auto-generated method stub
		userDAO.saveUser(u);
	}


	@Override
	@Transactional
	public Utilisateur getUserFromEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.getUserByEmail(email);
	}


	@Override
	@Transactional
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(id);
	}
	
	public boolean passwordMatch(String motDePasse,Utilisateur user) {
		return userDAO.passwordMatch(motDePasse,user);

	}


	@Override
	@Transactional
	public void updateConnexion(Utilisateur user) {
		// TODO Auto-generated method stub
		userDAO.updateConnexion(user);
	}

}

