package com.huios.GestionStock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.exceptions.ArticleNotFoundException;
import com.huios.exceptions.NotEnoughArticleException;
import com.huios.exceptions.QtyNegativeException;
import com.huios.metier.Stock;
import com.huios.service.Iservice;

public class Lanceur {

	public static void main(String[] args) throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException {
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.recuperation d'un bean
	Iservice service = (Iservice) appContext.getBean("serviceImpl");
		Stock s = (Stock) appContext.getBean("stock");
		Stock s1 = (Stock) appContext.getBean("stock");
		Stock s2 = (Stock) appContext.getBean("stock");
		//s.setNom("ordi");
		//s.setQty(40);
		//service.ajouter(s);
		//s1.setNom("clavier");
		//s1.setQty(20);
		//service.ajouter(s1);
		//s2.setNom("souris");
		//s2.setQty(0);
		//service.ajouter(s2);
		System.out.println(service.getQtyStock(7));
		service.sortirArticleDuStock(7, 10000);
	}
}
