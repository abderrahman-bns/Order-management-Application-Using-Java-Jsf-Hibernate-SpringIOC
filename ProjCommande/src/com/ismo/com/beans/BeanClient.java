package com.ismo.com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Client;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanClient {

	@Autowired
	IMetier<Client> metierClient;
	
	public List<Client> getListClients() {
		return metierClient.findAll();
	}
}
