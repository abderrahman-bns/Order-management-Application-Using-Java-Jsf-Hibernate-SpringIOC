package com.ismo.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LIGNE_COMMANDE")
public class LigneCommande {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_licom; 
	
	@Column
	private double qte;
	
	@ManyToOne
	@JoinColumn(name="numcom")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name="numart")
	private Article article;
	
	public LigneCommande() {
		
	}
	
	public LigneCommande(int id_licom, double qte) {
		super();
		this.id_licom = id_licom;
		this.qte = qte;
	}

	public int getId_licom() {
		return id_licom;
	}
	public void setId_licom(int id_licom) {
		this.id_licom = id_licom;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
}