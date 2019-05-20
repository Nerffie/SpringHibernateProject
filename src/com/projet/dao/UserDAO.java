package com.projet.dao;

import java.util.List;

import com.projet.entity.Utilisateur;

public interface UserDAO {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Utilisateur getUser(int id);

	public void deleteUser(int id);
}
