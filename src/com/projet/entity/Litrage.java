package com.projet.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="litrage")
public class Litrage {
		
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_litrage")
	private int id;
	
	@Column(name="epaisseurX")
	private int epaisseurX;
	
	@Column(name="epaisseurY")
	private int epaisseurY;
	
	@Column(name="consommmation")
	private float consommation;
	
	@Transient
	private float superficie;
	
	public Litrage(int id, int epaisseurX, int epaisseurY, float consommation) {
		super();
		this.id = id;
		this.epaisseurX = epaisseurX;
		this.epaisseurY = epaisseurY;
		this.consommation = consommation;
	}
	
	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public Litrage(int id, int epaisseurX, int epaisseurY, float consommation, float superficie) {
		super();
		this.id = id;
		this.epaisseurX = epaisseurX;
		this.epaisseurY = epaisseurY;
		this.consommation = consommation;
		this.superficie = superficie;
	}

	public Litrage() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEpaisseurX() {
		return epaisseurX;
	}
	public void setEpaisseurX(int epaisseurX) {
		this.epaisseurX = epaisseurX;
	}
	public int getEpaisseurY() {
		return epaisseurY;
	}
	public void setEpaisseurY(int epaisseurY) {
		this.epaisseurY = epaisseurY;
	}
	public float getConsommation() {
		return consommation;
	}
	public void setConsommation(float consommation) {
		this.consommation = consommation;
	}
	@Override
	public String toString() {
		return "Litrage [id=" + id + ", epaisseurX=" + epaisseurX + ", epaisseurY=" + epaisseurY + ", consommation="
				+ consommation + "]";
	}
	
	

}
