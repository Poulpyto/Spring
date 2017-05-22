package com.gtm.service;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IDao;
import com.gtm.metier.Client;

@Named
public class ServiceImpl implements IService, Serializable {

	@Inject
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
