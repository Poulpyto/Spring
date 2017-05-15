package com.huios.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		//1.chargement du conteneur et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.recuperation d'un bean
		Performeur olivier		= (Performeur) appContext.getBean("olivier");
		Performeur julien		= (Performeur) appContext.getBean("julien");
		Performeur alain		= (Performeur) appContext.getBean("alain");
		Performeur louis		= (Performeur) appContext.getBean("louis");
		Performeur michelle		= (Performeur) appContext.getBean("michelle");
		Performeur maurice		= (Performeur) appContext.getBean("maurice");
		Performeur martin		= (Performeur) appContext.getBean("martin");
		Performeur monMusicien	= (Performeur) appContext.getBean("monMusicien");
		//3.traitement
		System.out.println("olivier: ");
		olivier.performe();
		System.out.println("julien (list) ");
		julien.performe();
		System.out.println("alain (set) ");
		alain.performe();
		System.out.println("louis qui doit jouer le mm morceau qu'olivier");
		louis.performe();
		System.out.println("Michelle autowire byname");
		michelle.performe();
		System.out.println("maurice autowire bytype");
		maurice.performe();
		System.out.println("martin methode abstract");
		martin.performe();
		System.out.println("par annotation et injection pour lui");
		monMusicien.performe();
		//4.detruire le contexte
		appContext.close();
	}

}
