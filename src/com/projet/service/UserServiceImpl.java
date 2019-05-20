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
	public Utilisateur getUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}


	@Override
	@Transactional
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(id);
	}

}

