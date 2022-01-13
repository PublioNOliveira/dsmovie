package com.devsuperior.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	//findByEmail(String email) faz uma busca no BD por email é padrão do spring data jpa
	User findByEmail(String email);

}
