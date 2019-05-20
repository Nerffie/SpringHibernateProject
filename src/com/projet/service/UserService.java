package com.projet.service;

import java.util.List;

import com.projet.entity.Utilisateur;

public interface UserService {
	
	
	public List<Utilisateur> getUsers();

	public void saveUser(Utilisateur u);

	public Utilisateur getUser(int id);

	public void deleteUser(int id);
}
