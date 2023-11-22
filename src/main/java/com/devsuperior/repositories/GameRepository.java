package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
	
}
