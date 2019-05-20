package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.AdminDAO;
import com.projet.dao.UserDAO;
import com.projet.entity.Admin;
import com.projet.entity.Utilisateur;
import com.projet.service.UserService;

@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	private AdminDAO adminDAO;
	
	



	@Override
	@Transactional
	public boolean passwordMatch(String motDePasse, Admin admin) {
		// TODO Auto-generated method stub
		return adminDAO.passwordMatch(motDePasse,admin);
	}





	@Override
	@Transactional
	public List<Utilisateur> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	@Transactional
	public void saveUser(Utilisateur u) {
		// TODO Auto-generated method stub
		
	}





	@Override
	@Transactional
	public Admin getAdminFromId(String id) {
		// TODO Auto-generated method stub
		return adminDAO.getAdminById(id);
	}





	@Override
	@Transactional
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

}

