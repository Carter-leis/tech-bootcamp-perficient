package com.perficient.techbootcampcarterleising.Repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampcarterleising.Entity.Player;

@Repository
public class JpaServices {
	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> findAll() {
		Iterable<Player> list;
		list = playerRepository.findAll();
		List<Player> retList = new ArrayList<Player>();
		for(Player temp: list) {
			retList.add(temp);
		}
		return retList;
	}
	
	public Optional <Player> findById(int id) {
		return playerRepository.findById(id);
	}
	
	public Optional <Player> findByName(String name) {
		return playerRepository.findByName(name);
	}
	
	public Player createPlayer(Player player) {
		return playerRepository.save(player);
	}
	
	public void deletePlayer(int id) {
		playerRepository.deleteById(id);
	}
	
	public Player updatePlayer(Optional<Player> player, String col, int num) {
		if(col.toLowerCase() == "goals") {
			
		}if(col.toLowerCase() == "assists") {
			
		}if(col.toLowerCase() == "shots") {
			
		}if(col.toLowerCase() == "gp") {
			
		}if(col.toLowerCase() == "plusminus") {
			
		}
	}
}
