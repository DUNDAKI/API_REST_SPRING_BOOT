package com.vigjoaopaulo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.model.Pessoas;



@Repository
public interface ClienteRepository extends JpaRepository<Pessoas, Long>{
	
	//interface
	
}
