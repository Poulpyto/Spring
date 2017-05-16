package com.huios.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huios.metier.User;
@Transactional
@Repository
public class DaoImplJPA implements IDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		System.out.println("ajouter a partir de jpa");
		em.persist(u);
	}

	@Override
	public List<User> listerUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUser(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listerParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
