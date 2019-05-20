package com.projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="continuejumelle")
public class ContinueJumelle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_continue_jumelle")
	private int id;
	@Column(name="epaisseurX")
	private int epaisseurX;
	@Column(name="epaisseurY")
	private int epaisseurY;
	@Column(name="charge_150")
	private float charge_150;
	@Column(name="charge_250")
	private float charge_250;
	@Column(name="charge_400")
	private float charge_400;
	@Column(name="charge_500")
	private float charge_500;
	@Column(name="charge_150T")
	private float charge_150T;
	@Column(name="100T")
	private float charge_100T;
	
	
	public ContinueJumelle() {
		super();
	}
	public ContinueJumelle(int id, int epaisseurX, int epaisseurY, float charge_150, float charge_250, float charge_400,
			float charge_500, float charge_150t, float charge_100t) {
		super();
		this.id = id;
		this.epaisseurX = epaisseurX;
		this.epaisseurY = epaisseurY;
		this.charge_150 = charge_150;
		this.charge_250 = charge_250;
		this.charge_400 = charge_400;
		this.charge_500 = charge_500;
		charge_150T = charge_150t;
		charge_100T = charge_100t;
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
	public float getCharge_150() {
		return charge_150;
	}
	public void setCharge_150(float charge_150) {
		this.charge_150 = charge_150;
	}
	public float getCharge_250() {
		return charge_250;
	}
	public void setCharge_250(float charge_250) {
		this.charge_250 = charge_250;
	}
	public float getCharge_400() {
		return charge_400;
	}
	public void setCharge_400(float charge_400) {
		this.charge_400 = charge_400;
	}
	public float getCharge_500() {
		return charge_500;
	}
	public void setCharge_500(float charge_500) {
		this.charge_500 = charge_500;
	}
	public float getCharge_150T() {
		return charge_150T;
	}
	public void setCharge_150T(float charge_150t) {
		charge_150T = charge_150t;
	}
	public float getCharge_100T() {
		return charge_100T;
	}
	public void setCharge_100T(float charge_100t) {
		charge_100T = charge_100t;
	}
	@Override
	public String toString() {
		return "ContinueJumelle [id=" + id + ", epaisseurX=" + epaisseurX + ", epaisseurY=" + epaisseurY
				+ ", charge_150=" + charge_150 + ", charge_250=" + charge_250 + ", charge_400=" + charge_400
				+ ", charge_500=" + charge_500 + ", charge_150T=" + charge_150T + ", charge_100T=" + charge_100T + "]";
	}
	
	
}
