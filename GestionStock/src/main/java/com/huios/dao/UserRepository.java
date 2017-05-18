package com.huios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.huios.metier.Stock;

public interface UserRepository extends JpaRepository<Stock, Integer> {
	@Modifying
	@Query("update Stock s set s.qty=s.qty-?2 where s.id=?1")
	void	sortirArticleDuStock(int id, int qty);
	
	/*@Query("select s.qty from stock s where s.id = ?1")
	int		getQtyStock(int id);*/
	
	//boolean	articleExist(int id);
}
