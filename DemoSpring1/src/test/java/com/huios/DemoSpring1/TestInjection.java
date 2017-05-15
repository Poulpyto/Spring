package com.huios.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		//1.chargement du conteneur et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.recuperation d'un bean
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societe");
		
		//3.traitement
		System.out.println(societe);
		//4.detruire le contexte
		appContext.close();
	}

}
