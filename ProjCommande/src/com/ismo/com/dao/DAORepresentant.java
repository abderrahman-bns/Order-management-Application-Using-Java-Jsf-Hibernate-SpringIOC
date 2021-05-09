package com.ismo.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Representant;

@EnableTransactionManagement
@Transactional
@Repository("daoRepresentant")
public class DAORepresentant implements IDao<Representant> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(Representant o) {
		try {	
			sessionFactory.getCurrentSession().save(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Representant o) {
		try {	
			sessionFactory.getCurrentSession().update(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Representant o) {
		try {	
			sessionFactory.getCurrentSession().delete(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Representant findById(int id) {
		return sessionFactory.getCurrentSession().get(Representant.class,id);
	}

	@Override
	public List<Representant> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Representant").getResultList();
	}

}
