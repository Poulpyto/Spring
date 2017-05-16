package com.huios.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huios.metier.User;
@Repository
@Transactional
public class DaoImplHibernate implements IDao {

	@Autowired
	private SessionFactory	sessionFactory;
	
	private Session	getSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void ajouterUser(User u) {
		getSession().save(u);
		System.out.println("ajouter a partir de hibernate");
	}

	
	@Override
	public List<User> listerUsers() {
		String req = "from User";
		Query query = getSession().createQuery(req);
		return query.list();
	}

	@Override
	public void supprimerUser(long id) {
		getSession().delete(trouverUser(id));		
	}

	@Override
	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return (User) getSession().get(User.class, id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		String req = "from User as u where u.nom like :nom";
		Query query = getSession().createQuery(req);
		query.setParameter("nom", "%"+nom+"%");
		return query.list();
	}

	@Override
	public List<User> listerParNom(String nom) {
		String req = "from User as u where u.nom like :nom";
		Query query = getSession().createQuery(req);
		query.setParameter("nom", nom);
		return query.list();
	}

}
