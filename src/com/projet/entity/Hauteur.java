package com.projet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hauteur {
	@Id
	private float hspb;
	private float gaine;
	private float fp;
	private float epaisseurRev;
	private float hspn;
	
	
	
	public float getHspn() {
		return hspn;
	}
	public void setHspn(float hspn) {
		this.hspn = hspn;
	}
	public float getHspb() {
		return hspb;
	}
	public void setHspb(float hspb) {
		this.hspb = hspb;
	}
	public float getGaine() {
		return gaine;
	}
	public void setGaine(float gaine) {
		this.gaine = gaine;
	}
	public float getFp() {
		return fp;
	}
	public void setFp(float fp) {
		this.fp = fp;
	}
	public float getEpaisseurRev() {
		return epaisseurRev;
	}
	public void setEpaisseurRev(float epaisseurRev) {
		this.epaisseurRev = epaisseurRev;
	}
	public Hauteur(float hspb, float gaine, float fp, float epaisseurRev) {
		super();
		this.hspb = hspb;
		this.gaine = gaine;
		this.fp = fp;
		this.epaisseurRev = epaisseurRev;
	}
	public Hauteur() {
		super();
	}
	@Override
	public String toString() {
		return "Hauteur [hspb=" + hspb + ", gaine=" + gaine + ", fp=" + fp + ", epaisseurRev=" + epaisseurRev + "]";
	}

	
	
	
	
	
	

}
