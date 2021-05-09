package com.ismo.com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Article;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanArticle {

	@Autowired
	IMetier<Article> metierArticle;
	
	public List<Article> getListArticles() {
		return metierArticle.findAll();
	}
}
