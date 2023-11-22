package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
	
}
