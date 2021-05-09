package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.Region;

@Service
public class MetierRegion implements IMetier<Region>{

	@Autowired
	IDao<Region> daoRegion;
	
	@Override
	public boolean create(Region o) {
		// TODO Auto-generated method stub
		return daoRegion.create(o);
	}

	@Override
	public boolean update(Region o) {
		// TODO Auto-generated method stub
		return daoRegion.update(o);
	}

	@Override
	public boolean delete(Region o) {
		// TODO Auto-generated method stub
		return daoRegion.delete(o);
	}

	@Override
	public Region findById(int id) {
		// TODO Auto-generated method stub
		return daoRegion.findById(id);
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return daoRegion.findAll();
	}
}
