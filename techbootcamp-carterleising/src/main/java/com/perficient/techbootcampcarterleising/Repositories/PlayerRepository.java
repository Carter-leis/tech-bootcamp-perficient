package com.perficient.techbootcampcarterleising.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampcarterleising.Entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
	Optional <Player> findByName(String name);
}
