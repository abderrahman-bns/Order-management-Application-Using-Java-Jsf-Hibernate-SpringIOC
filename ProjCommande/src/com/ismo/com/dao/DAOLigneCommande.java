package com.ismo.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Commande;
import com.ismo.com.entities.LigneCommande;


@EnableTransactionManagement
@Transactional
@Repository("daoLigneCommande")
public class DAOLigneCommande implements IDao<LigneCommande>{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(LigneCommande o) {
		try {	
			sessionFactory.getCurrentSession().save(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(LigneCommande o) {
		try {	
			sessionFactory.getCurrentSession().update(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(LigneCommande o) {
		try {	
			sessionFactory.getCurrentSession().delete(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public LigneCommande findById(int id) {
		return sessionFactory.getCurrentSession().get(LigneCommande.class,id);
	}

	@Override
	public List<LigneCommande> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from LigneCommande").getResultList();
	}

}
