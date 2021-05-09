package com.ismo.com.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Region;
import com.ismo.com.entities.Representant;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanRegion {

	@Autowired
	IMetier<Region> metierRegion;
	
	Region reg = new Region();
	Region selectedRegion = new Region();
	
	public Region getSelectedRegion() {
		return selectedRegion;
	}

	public void setSelectedRegion(Region selectedRegion) {
		this.selectedRegion = selectedRegion;
	}

	public Region getReg() {
		return reg;
	}

	public void setReg(Region reg) {
		this.reg = reg;
	}

	public List<Region> getListRegions() {
		return metierRegion.findAll();
	}
	
	public void save() {
		FacesContext context = FacesContext.getCurrentInstance();
         
		if(metierRegion.create(reg)) {
			context.addMessage(null, new FacesMessage("Successful",  "Region ajoute avec succes"));
		}else {
			context.addMessage(null, new FacesMessage("Error",  "Erreur d'ajout de region"));
		}
		
		reg.setNomregion(""); 
		reg.setNbHabitant(0);
	}
	
	public void delete() {
		FacesContext context = FacesContext.getCurrentInstance();
         
		if(metierRegion.delete(selectedRegion)) {
			context.addMessage(null, new FacesMessage("Successful",  "Region supprime avec succes"));
		}else {
			context.addMessage(null, new FacesMessage("Error",  "Erreur de suppression de la region"));
		}
	}
	
	public void update() {
		FacesContext context = FacesContext.getCurrentInstance();
         
		if(metierRegion.update(selectedRegion)) {
			context.addMessage(null, new FacesMessage("Successful",  "Region modifie avec succes"));
			PrimeFaces.current().ajax().addCallbackParam("loggedIn", true);
		}else {
			context.addMessage(null, new FacesMessage("Error",  "Erreur de modification de la region"));
			PrimeFaces.current().ajax().addCallbackParam("loggedIn", false);
		}
	}
}
