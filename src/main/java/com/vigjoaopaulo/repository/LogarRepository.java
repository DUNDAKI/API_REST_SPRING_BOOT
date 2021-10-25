package com.vigjoaopaulo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.model.Logar;


@Repository
public interface LogarRepository extends JpaRepository<Logar, Long>{

}
