package com.ismo.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ismo.com.entities.Article;


@Transactional
@EnableTransactionManagement
@Repository("daoArticle")
public class DAOArticle implements IDao<Article>{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean create(Article o) {
		try {
			sessionFactory.getCurrentSession().save(o);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Article o) {
		try {
			sessionFactory.getCurrentSession().update(o);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Article o) {
		try {
			sessionFactory.getCurrentSession().delete(o);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article findById(int id) {
		return sessionFactory.getCurrentSession().get(Article.class,id);
	}

	@Override
	public List<Article> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Article").getResultList();
	}

}
