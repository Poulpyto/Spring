package com.huios.service;

import com.huios.exceptions.ArticleNotFoundException;
import com.huios.exceptions.NotEnoughArticleException;
import com.huios.exceptions.QtyNegativeException;
import com.huios.metier.Stock;

public interface Iservice {
	public void		sortirArticleDuStock(int id, int qty)throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException;
	public int		getQtyStock(int id) throws ArticleNotFoundException;
	//public boolean	articleExist(int id);
	public void 	ajouter(Stock s);
}
