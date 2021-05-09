package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.Representant;

@Service
public class MetierRepresentant implements IMetier<Representant> {

	@Autowired
	IDao<Representant> daoRepresentant;
	
	@Override
	public boolean create(Representant o) {
		// TODO Auto-generated method stub
		return daoRepresentant.create(o);
	}

	@Override
	public boolean update(Representant o) {
		// TODO Auto-generated method stub
		return daoRepresentant.update(o);
	}

	@Override
	public boolean delete(Representant o) {
		// TODO Auto-generated method stub
		return daoRepresentant.delete(o);
	}

	@Override
	public Representant findById(int id) {
		// TODO Auto-generated method stub
		return daoRepresentant.findById(id);
	}

	@Override
	public List<Representant> findAll() {
		// TODO Auto-generated method stub
		return daoRepresentant.findAll();
	}
}
