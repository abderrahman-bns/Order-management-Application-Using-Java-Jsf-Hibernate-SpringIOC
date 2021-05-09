package com.ismo.com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Commande {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numcom;
	
	@Temporal(TemporalType.DATE)
	private Date datecom;
	
	@ManyToOne
	@JoinColumn(name="numcli")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="numrep")
	private Representant representant;
	
	public Commande() {
	}
	public int getNumcom() {
		return numcom;
	}
	public void setNumcom(int numcom) {
		this.numcom = numcom;
	}
	public Date getDatecom() {
		return datecom;
	}
	public void setDatecom(Date datecom) {
		this.datecom = datecom;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Representant getRepresentant() {
		return representant;
	}
	public void setRepresentant(Representant representant) {
		this.representant = representant;
	}
	
	
	
	
}
