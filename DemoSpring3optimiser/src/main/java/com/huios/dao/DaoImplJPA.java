package com.huios.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public List<User> listerUsers() {
		Query req = em.createQuery("SELECT c FROM User c");
		return req.getResultList();
	}

	public void supprimerUser(long id) {
		em.remove(trouverUser(id));

	}

	public User trouverUser(long id) {
		return em.find(User.class, id);
	}

	public List<User> listerParMC(String nom) {
		Query req = em.createQuery("SELECT c FROM User c where c.nom like Upper(:nom)");
		req.setParameter("nom", "%" + nom + "%");
		return req.getResultList();
	}

	public List<User> listerParNom(String nom) {
		Query req = em.createQuery("SELECT c FROM User c where c.nom = Upper(:nom)");
		req.setParameter("nom", nom);
		return req.getResultList();
	}


}
