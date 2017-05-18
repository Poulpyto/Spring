package com.huios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huios.dao.UserRepository;
import com.huios.exceptions.ArticleNotFoundException;
import com.huios.exceptions.NotEnoughArticleException;
import com.huios.exceptions.QtyNegativeException;
import com.huios.metier.Stock;

@Transactional
@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private UserRepository userRepository;
	
	public void sortirArticleDuStock(int id, int qty) throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException {
		if (qty < 0)
			throw new QtyNegativeException("vous ne pouvez pas ajouter un chiffre negatif");
		if (!userRepository.exists(id))
			throw new ArticleNotFoundException("article non present en base");
		if (userRepository.findOne(id).getQty() < qty)
			throw new NotEnoughArticleException("pas assez d'article");
		userRepository.sortirArticleDuStock(id, qty);
	}

	public int getQtyStock(int id) throws ArticleNotFoundException{
		if (!userRepository.exists(id))
			throw new ArticleNotFoundException("article non present en base");
		return (userRepository.findOne(id).getQty());
	}

	public boolean articleExist(int id) {
		if (userRepository.exists((int) id))
			return true;
		return false;
	}

	@Override
	public void ajouter(Stock s) {
		// TODO Auto-generated method stub
		userRepository.save(s);
	}
	

}
