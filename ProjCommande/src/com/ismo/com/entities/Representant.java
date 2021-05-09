package com.ismo.com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Representant {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numrep;
	
	@Column
	private String nomrep;
	
	@Column
	private String telrep;
	
	@ManyToOne
	@JoinColumn(name="numreg")
	private Region region;
	
	@OneToMany(mappedBy = "representant",fetch = FetchType.LAZY)
	private List<Commande> commandes;
	
	public Representant() {
		
	}
	
	public Representant(int numrep, String nomrep, String telrep) {
		this.numrep = numrep;
		this.nomrep = nomrep;
		this.telrep = telrep;
	}
	public int getNumrep() {
		return numrep;
	}
	public void setNumrep(int numrep) {
		this.numrep = numrep;
	}
	public String getNomrep() {
		return nomrep;
	}
	public void setNomrep(String nomrep) {
		this.nomrep = nomrep;
	}
	public String getTelrep() {
		return telrep;
	}
	public void setTelrep(String telrep) {
		this.telrep = telrep;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	} 
	
}
