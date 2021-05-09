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
public class Client {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numcli;
	
	@Column
	private String nomcli;
	
	@Column
	private String villecli;
	
	@Column
	private int cpcli;
	
	@Column
	private String telcli;
	
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private List<Commande> commandes;
	
	public Client() {
		
	}
	
	public Client(int numcli, String nomcli, String villecli, int cpcli, String telcli) {
		this.numcli = numcli;
		this.nomcli = nomcli;
		this.villecli = villecli;
		this.cpcli = cpcli;
		this.telcli = telcli;
	}
	
	public int getNumcli() {
		return numcli;
	}
	public void setNumcli(int numcli) {
		this.numcli = numcli;
	}
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getVillecli() {
		return villecli;
	}
	public void setVillecli(String villecli) {
		this.villecli = villecli;
	}
	public int getCpcli() {
		return cpcli;
	}
	public void setCpcli(int cpcli) {
		this.cpcli = cpcli;
	}
	public String getTelcli() {
		return telcli;
	}
	public void setTelcli(String telcli) {
		this.telcli = telcli;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
}
