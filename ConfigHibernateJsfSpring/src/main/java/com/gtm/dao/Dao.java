package com.gtm.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.Client;


@Transactional
@Repository
public class Dao implements IDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public long addClient(Client c) {
		getSession().save(c);
		return c.getId();
	}

	@Override
	public Collection<Client> listClients() {
		String req = "FROM Client";
		Query query = getSession().createQuery(req);
		return query.list();
	}

	@Override
	public void deleteClient(Client c) {
		getSession().delete(c);
		
	}

	@Override
	public Client findClientById(long idClient) {
		return getSession().get(Client.class,idClient);
	}

	@Override
	public void majClient(Client c) {
		getSession().update(c);;
	}

}
