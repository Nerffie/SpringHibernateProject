package com.projet.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name="utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utilisateur")
	private int id;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="date_naissance")
	private Date dateNaissance;
	
	@Column(name="email")
	private String email;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="mot_de_passe")
	private String motDePasse;
	
	@Column(name="categorie")
	private String categorie;
	
	@Column(name="sous_categorie")
	private String sousCategorie;
	
	@Column(name="valide")
	private int valide;
	
	@Column(name="portee_1")
	private int portee_1;
	
	@Column(name="portee_2")
	private int portee_2;
	
	

	@Column(name="portee_3")
	private int portee_3;
	
	@Column(name="portee_4")
	private int portee_4;
	
	@Column(name="date_inscription")
	private Date dateInscription;
	
	@Column(name="valide_hash")
	private String valideHash;
	
	@Column(name="date_connexion")
	private Date dateConnexion;
	
	public Utilisateur(int id, String prenom, String nom, Date dateNaissance, String email, String ville,
			String motDePasse, String categorie, String sousCategorie, int valide, int portee_1, int portee_2,
			int portee_3, int portee_4, Date dateInscription, String valideHash, Date dateConnexion) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.categorie = categorie;
		this.sousCategorie = sousCategorie;
		this.valide = valide;
		this.portee_1 = portee_1;
		this.portee_2 = portee_2;
		this.portee_3 = portee_3;
		this.portee_4 = portee_4;
		this.dateInscription = dateInscription;
		this.valideHash = valideHash;
		this.dateConnexion = dateConnexion;
	}

	public Utilisateur(String email, String motDePasse) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public Utilisateur(String prenom, String nom, Date dateNaissance, String email, String ville, String motDePasse,
			String categorie, String sousCategorie, int valide, int portee_1, int portee_2, int portee_3, int portee_4,
			Date dateInscription, String valideHash, Date dateConnexion) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.categorie = categorie;
		this.sousCategorie = sousCategorie;
		this.valide = valide;
		this.portee_1 = portee_1;
		this.portee_2 = portee_2;
		this.portee_3 = portee_3;
		this.portee_4 = portee_4;
		this.dateInscription = dateInscription;
		this.valideHash = valideHash;
		this.dateConnexion = dateConnexion;
	}

	public Utilisateur() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(String sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	public int getValide() {
		return valide;
	}

	public void setValide(int valide) {
		this.valide = valide;
	}

	public int getPortee_1() {
		return portee_1;
	}

	public void setPortee_1(int portee_1) {
		this.portee_1 = portee_1;
	}

	public int getPortee_2() {
		return portee_2;
	}

	public void setPortee_2(int portee_2) {
		this.portee_2 = portee_2;
	}

	public int getPortee_3() {
		return portee_3;
	}

	public void setPortee_3(int portee_3) {
		this.portee_3 = portee_3;
	}

	public int getPortee_4() {
		return portee_4;
	}

	public void setPortee_4(int portee_4) {
		this.portee_4 = portee_4;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getValideHash() {
		return valideHash;
	}

	public void setValideHash(String valideHash) {
		this.valideHash = valideHash;
	}

	public Date getDateConnexion() {
		return dateConnexion;
	}

	public void setDateConnexion(Date dateConnexion) {
		this.dateConnexion = dateConnexion;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance
				+ ", email=" + email + ", ville=" + ville + ", motDePasse=" + motDePasse + ", categorie=" + categorie
				+ ", sousCategorie=" + sousCategorie + ", valide=" + valide + ", portee_1=" + portee_1 + ", portee_2="
				+ portee_2 + ", portee_3=" + portee_3 + ", portee_4=" + portee_4 + ", dateInscription="
				+ dateInscription + ", valideHash=" + valideHash + ", dateConnexion=" + dateConnexion + "]";
	}
	
	
}
