package com.perficient.techbootcampcarterleising;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	PlayerRepository playerRepository;
	
	@GetMapping(path = "getdata")
	String getPlayers() {
		log.info("Get all players");
		for(Player player: playerRepository.findAll()) {
			log.info(player.toString());
		}
		return playerRepository.findAll().toString();
	}
	
	@GetMapping(path = "findById")

	String findPlayerById() {
		log.info("Get player by Id");
		Player temp = playerRepository.findById(1);
		log.info(temp.toString());
		return temp.toString();
	}
	
	@GetMapping(path = "findByName")
	String findPlayerByName() {
		log.info("Get player by name");
		Player temp = playerRepository.findByName("letang");
		log.info(temp.toString());
		return temp.toString();
	}
}
