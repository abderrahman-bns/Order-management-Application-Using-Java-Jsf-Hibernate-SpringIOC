package com.ismo.com.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Commande;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanCalendiercom {

	private ScheduleModel eventModel;
	
	@Autowired
	IMetier<Commande> metierCommande;
	
	Commande commande;

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public ScheduleModel getEventModel() {
		return eventModel;
	}

	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}
	
	public BeanCalendiercom() {
		
	}
	
	@PostConstruct
	public void init() {
		eventModel = new DefaultScheduleModel();
		 
		List<Commande> coms = metierCommande.findAll();
		
		int cpt = 0;
		for(Commande c : coms) {
	        DefaultScheduleEvent event = new DefaultScheduleEvent();
	        event.setTitle(String.format("Commande %d", c.getNumcom()));
	        event.setStartDate(c.getDatecom());
	        event.setEndDate(c.getDatecom());
	        event.setDescription(String.format("Commande %d", cpt++));
	        eventModel.addEvent(event);
		}
	}
	
	 public void onEventSelect(SelectEvent selectEvent) {
		 DefaultScheduleEvent event = (DefaultScheduleEvent) selectEvent.getObject();
		 
		 int num = Integer.valueOf(event.getTitle().substring(9));
		 
		 commande = metierCommande.findById(num);
	 }
	 
	 public void onEventMove(ScheduleEntryMoveEvent event) {
		 	
		 	Commande com = metierCommande.findById(Integer.valueOf(event.getScheduleEvent().getTitle().substring(9)));
		 	FacesMessage message=null;
		 	
		 	com.setDatecom(event.getScheduleEvent().getStartDate());
		 	
		 	if(metierCommande.update(com))
		 		message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Commande moved", "Succes");
		 	else 
		 		message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Commande moved", "Error");
	         
	        addMessage(message);
    }
	 
	private void addMessage(FacesMessage message) {
	        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
}
