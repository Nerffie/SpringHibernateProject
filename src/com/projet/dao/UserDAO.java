package com.projet.dao;

import java.util.List;

import com.projet.entity.Utilisateur;

public interface UserDAO {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Utilisateur getUser(int id);
	
	public Utilisateur getUserByEmail(String email);

	public void deleteUser(int id);
	
	public boolean passwordMatch(String motDePasse, Utilisateur user);

	public void updateConnexion(Utilisateur user);
}
