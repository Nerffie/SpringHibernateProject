package com.projet.service;

import java.util.List;

import com.projet.entity.Utilisateur;

public interface UserService {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Utilisateur getUserFromEmail(String email);
	

	public void deleteUser(int id);
	public boolean passwordMatch(String motDePasse,Utilisateur user);

	public void updateConnexion(Utilisateur user);
}
