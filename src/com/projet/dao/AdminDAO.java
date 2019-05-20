package com.projet.dao;

import java.util.List;

import com.projet.entity.Admin;
import com.projet.entity.Utilisateur;

public interface AdminDAO {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Utilisateur getUser(int id);
	
	public Admin getAdminById(String id);

	public void deleteUser(int id);
	
	public boolean passwordMatch(String motDePasse, Admin admin);
}
