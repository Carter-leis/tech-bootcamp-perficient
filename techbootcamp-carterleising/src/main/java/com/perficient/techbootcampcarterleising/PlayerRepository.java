package com.perficient.techbootcampcarterleising;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	@Override
	//try to not use these, this is for creating your own
	List<Player> findAll();
	Player findById(int id);
	Player findByName(String name);
}
