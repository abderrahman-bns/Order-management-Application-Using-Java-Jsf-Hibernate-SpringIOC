package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.Article;

@Service
public class MetierArticle implements IMetier<Article>{

	@Autowired
	IDao<Article> daoArticle;
	
	@Override
	public boolean create(Article o) {
		// TODO Auto-generated method stub
		return daoArticle.create(o);
	}

	@Override
	public boolean update(Article o) {
		// TODO Auto-generated method stub
		return daoArticle.update(o);
	}

	@Override
	public boolean delete(Article o) {
		// TODO Auto-generated method stub
		return daoArticle.delete(o);
	}

	@Override
	public Article findById(int id) {
		// TODO Auto-generated method stub
		return daoArticle.findById(id);
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return daoArticle.findAll();
	}

}
