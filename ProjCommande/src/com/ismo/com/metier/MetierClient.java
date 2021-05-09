package com.ismo.com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.com.dao.IDao;
import com.ismo.com.entities.Client;

@Service
public class MetierClient implements IMetier<Client> {

	@Autowired
	IDao<Client> daoClient;
	
	@Override
	public boolean create(Client o) {
		// TODO Auto-generated method stub
		return daoClient.create(o);
	}

	@Override
	public boolean update(Client o) {
		// TODO Auto-generated method stub
		return daoClient.update(o);
	}

	@Override
	public boolean delete(Client o) {
		// TODO Auto-generated method stub
		return daoClient.delete(o);
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return daoClient.findById(id);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return daoClient.findAll();
	}

}
