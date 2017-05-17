package com.gtm.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.Client;


@Transactional
@Repository
public class Dao implements IDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public long addClient(Client c) {
		em.persist(c);
		return c.getId();
	}

	@Override
	public Collection<Client> listClients() {
		Collection<Client> clients = em.createNamedQuery("Client.findAll").getResultList();
		return clients;
	}

	@Override
	public void deleteClient(Client c) {
		em.remove(em.contains(c) ? c : em.merge(c));
	}

	@Override
	public Client findClientById(long idClient) {
		Client client = em.find(Client.class, idClient);
		return client;
	}

	@Override
	public void majClient(Client c) {
		em.merge(c);
	}

}
