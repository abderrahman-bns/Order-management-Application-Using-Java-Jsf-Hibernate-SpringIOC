package com.ismo.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Client;

@EnableTransactionManagement
@Transactional
@Repository("daoClient")
public class DAOClient implements IDao<Client> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(Client o) {
		try {	
			sessionFactory.getCurrentSession().save(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Client o) {
		try {	
			sessionFactory.getCurrentSession().update(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Client o) {
		try {	
			sessionFactory.getCurrentSession().delete(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Client findById(int id) {
		return sessionFactory.getCurrentSession().get(Client.class,id);
	}

	@Override
	public List<Client> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Client").getResultList();
	}
}