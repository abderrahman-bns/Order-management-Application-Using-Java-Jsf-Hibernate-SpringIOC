package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.Commande;

@Service
public class MetierCommande implements IMetier<Commande>{

	@Autowired
	IDao<Commande> daoCommande;
	
	@Override
	public boolean create(Commande o) {
		// TODO Auto-generated method stub
		return daoCommande.create(o);
	}

	@Override
	public boolean update(Commande o) {
		// TODO Auto-generated method stub
		return daoCommande.update(o);
	}

	@Override
	public boolean delete(Commande o) {
		// TODO Auto-generated method stub
		return daoCommande.delete(o);
	}

	@Override
	public Commande findById(int id) {
		// TODO Auto-generated method stub
		return daoCommande.findById(id);
	}

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return daoCommande.findAll();
	}
}
