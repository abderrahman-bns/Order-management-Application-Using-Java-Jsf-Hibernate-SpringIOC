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
public class Region {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numreg;
	
	@Column
	private String nomregion;
	
	@Column
	private int nbHabitant;
	
	@OneToMany(mappedBy = "region",fetch = FetchType.LAZY)
	private List<Representant> representants;
	
	public Region() {
		
	}
	
	public Region(int numreg, String nomregion, int nbHabitant) {
		this.numreg = numreg;
		this.nomregion = nomregion;
		this.nbHabitant = nbHabitant;
	}
	public int getNumreg() {
		return numreg;
	}
	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}
	public String getNomregion() {
		return nomregion;
	}
	public void setNomregion(String nomregion) {
		this.nomregion = nomregion;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public List<Representant> getRepresentants() {
		return representants;
	}
	public void setRepresentants(List<Representant> representants) {
		this.representants = representants;
	} 
}
