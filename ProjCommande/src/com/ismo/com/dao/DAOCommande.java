package com.ismo.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Commande;


@EnableTransactionManagement
@Transactional
@Repository("daoCommande")
public class DAOCommande implements IDao<Commande>{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(Commande o) {
		try {	
			sessionFactory.getCurrentSession().save(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Commande o) {
		try {	
			sessionFactory.getCurrentSession().update(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Commande o) {
		try {	
			sessionFactory.getCurrentSession().delete(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Commande findById(int id) {
		return sessionFactory.getCurrentSession().get(Commande.class,id);
	}

	@Override
	public List<Commande> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Commande").getResultList();
	}
}
