package com.gtm.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtm.dao.IDao;
import com.gtm.metier.Client;

@Service
public class ServiceImpl implements IService, Serializable {

	@Autowired
	private IDao dao;

	@Override
	public long addClient(Client c) {
		return dao.addClient(c);
	}

	@Override
	public Collection<Client> listClients() {
		return dao.listClients();
	}

	@Override
	public void deleteClient(Client c) {
		dao.deleteClient(c);
	}

	@Override
	public void majClient(Client c) {
		dao.majClient(c);
	}

}
