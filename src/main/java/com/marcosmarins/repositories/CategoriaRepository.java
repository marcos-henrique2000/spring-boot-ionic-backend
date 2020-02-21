package com.marcosmarins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcosmarins.domain.Categoria;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	
	
}
