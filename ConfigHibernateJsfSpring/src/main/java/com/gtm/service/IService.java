package com.gtm.service;

import java.util.Collection;
import com.gtm.metier.Client;

public interface IService {

	public long addClient(Client c);
	public void deleteClient(Client c);
	public void majClient(Client c);
	public Collection<Client> listClients();
}
