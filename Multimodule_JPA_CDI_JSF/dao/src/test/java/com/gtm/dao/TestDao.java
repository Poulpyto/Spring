package com.gtm.dao;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.gtm.metier.Client;

public class TestDao {

	@Test
	public void test() {
		Client c =new Client();
		c.setNom("nom1");
		c.setPrenom("prenom1");
		IDao dao = new Dao();
		dao.addClient(c);
		assertEquals("nom1", c.getNom());
	}

}
