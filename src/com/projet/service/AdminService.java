package com.projet.service;

import java.util.List;

import com.projet.entity.Admin;
import com.projet.entity.Utilisateur;

public interface AdminService {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Admin getAdminFromId(String id);
	

	public void deleteUser(int id);
	public boolean passwordMatch(String motDePasse,Admin admin);
}
