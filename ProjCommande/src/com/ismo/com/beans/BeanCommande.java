package com.ismo.com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Commande;
import com.ismo.com.entities.Representant;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanCommande {

	@Autowired
	IMetier<Commande> metierCommande;
	
	public List<Commande> getListCommandes() {
		return metierCommande.findAll();
	}
}
