package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.LigneCommande;

@Service
public class MetierLigneCommande implements IMetier<LigneCommande>{

	@Autowired
	IDao<LigneCommande> daoLigneCommande;
	
	@Override
	public boolean create(LigneCommande o) {
		// TODO Auto-generated method stub
		return daoLigneCommande.create(o);
	}

	@Override
	public boolean update(LigneCommande o) {
		// TODO Auto-generated method stub
		return daoLigneCommande.update(o);
	}

	@Override
	public boolean delete(LigneCommande o) {
		// TODO Auto-generated method stub
		return daoLigneCommande.delete(o);
	}

	@Override
	public LigneCommande findById(int id) {
		// TODO Auto-generated method stub
		return daoLigneCommande.findById(id);
	}

	@Override
	public List<LigneCommande> findAll() {
		// TODO Auto-generated method stub
		return daoLigneCommande.findAll();
	}
}
