package com.ismo.com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Article {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numart;
	
	@Column
	private String libart;
	
	@Column
	private double prix_unitaire;
	
	@OneToMany(mappedBy = "article",fetch = FetchType.LAZY)
	private List<LigneCommande> lignescommandes;

	public Article() {
		
	}
	
	public Article(int numart, String libart, double prix_unitaire) {
		this.numart = numart;
		this.libart = libart;
		this.prix_unitaire = prix_unitaire;
	}

	public int getNumart() {
		return numart;
	}

	public void setNumart(int numart) {
		this.numart = numart;
	}

	public String getLibart() {
		return libart;
	}

	public void setLibart(String libart) {
		this.libart = libart;
	}

	public double getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public List<LigneCommande> getLignescommandes() {
		return lignescommandes;
	}

	public void setLignescommandes(List<LigneCommande> lignescommandes) {
		this.lignescommandes = lignescommandes;
	}
}