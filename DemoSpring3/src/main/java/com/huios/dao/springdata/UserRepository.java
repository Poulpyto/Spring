package com.huios.dao.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huios.metier.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findByNom(String nom);
	@Query ("Select u from User u where u.nom like %?1%")
	public List<User>	findByMC(String nom);
}
