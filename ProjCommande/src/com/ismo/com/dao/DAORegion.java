package com.ismo.com.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Region;


@EnableTransactionManagement
@Transactional
@Repository("daoRegion")
public class DAORegion implements IDao<Region>{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(Region o) {
		try {	
			sessionFactory.getCurrentSession().save(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Region o) {
		try {	
			sessionFactory.getCurrentSession().update(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Region o) {
		try {	
			sessionFactory.getCurrentSession().delete(o);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Region findById(int id) {
		return sessionFactory.getCurrentSession().get(Region.class,id);
	}

	@Override
	public List<Region> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Region").getResultList();
	}

}
