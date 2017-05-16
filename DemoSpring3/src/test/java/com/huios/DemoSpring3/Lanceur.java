package com.huios.DemoSpring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.User;
import com.huios.service.Iservice;

public class Lanceur {

	public static void main(String[] args) {
		//1.chargement du conteneur et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.recuperation d'un bean
		User user = (User) appContext.getBean("user");
		Iservice service = (Iservice) appContext.getBean("serviceImpl");
		user.setNom("toto");
		User user2 = (User) appContext.getBean("user");
		user2.setNom("titi");
		//System.out.println("bean user= "+ user.getNom());
		//System.out.println("bean user2= "+ user2.getNom());
		//3.traitement
		service.ajouterUser(user);
	
	//	System.out.println(service.listerUsers());
		//System.out.println(service.listerParNom("toto"));
	//	System.out.println(service.listerParMC("ti"));
		//service.ajouterUser(user);
		//service.ajouterUser(user2);
		//service.supprimerUser(1);
		//System.out.println(service.listerUsers());
		//4.detruire le contexte
		
		appContext.close();

	}

}
