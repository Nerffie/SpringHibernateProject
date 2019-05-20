package com.projet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Portee {
	@Id
	private String charge;
	private int epaisseurX;
	private int epaisseur12;
	private int epaisseur16;
	private int epaisseur20;
	private int epaisseur25;
	private int epaisseur30;
	
	
	
	public Portee() {
		super();
	}

	

	
	
	public Portee(String charge, int epaisseurX, int epaisseur12, int epaisseur16, int epaisseur20, int epaisseur25,
			int epaisseur30) {
		super();
		this.charge = charge;
		this.epaisseurX = epaisseurX;
		this.epaisseur12 = epaisseur12;
		this.epaisseur16 = epaisseur16;
		this.epaisseur20 = epaisseur20;
		this.epaisseur25 = epaisseur25;
		this.epaisseur30 = epaisseur30;
	}





	public String getCharge() {
		return charge;
	}



	public void setCharge(String charge) {
		this.charge = charge;
	}



	public int getEpaisseurX() {
		return epaisseurX;
	}



	public void setEpaisseurX(int epaisseurX) {
		this.epaisseurX = epaisseurX;
	}



	public int getEpaisseur12() {
		return epaisseur12;
	}



	public void setEpaisseur12(int epaisseur12) {
		this.epaisseur12 = epaisseur12;
	}



	public int getEpaisseur16() {
		return epaisseur16;
	}



	public void setEpaisseur16(int epaisseur16) {
		this.epaisseur16 = epaisseur16;
	}



	public int getEpaisseur20() {
		return epaisseur20;
	}



	public void setEpaisseur20(int epaisseur20) {
		this.epaisseur20 = epaisseur20;
	}



	public int getEpaisseur25() {
		return epaisseur25;
	}



	public void setEpaisseur25(int epaisseur25) {
		this.epaisseur25 = epaisseur25;
	}



	public int getEpaisseur30() {
		return epaisseur30;
	}



	public void setEpaisseur30(int epaisseur30) {
		this.epaisseur30 = epaisseur30;
	}
	
	

}
