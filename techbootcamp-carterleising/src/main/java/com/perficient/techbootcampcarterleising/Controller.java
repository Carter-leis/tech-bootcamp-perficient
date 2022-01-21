package com.perficient.techbootcampcarterleising;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	PlayerRepository playerRepository;
	
	@GetMapping("/getdata")
	public List<Player> getPlayers() {
		List<Player> temp = playerRepository.findAll();
		log.info("Get all players");
		for(Player player: temp) {
			log.info(player.toString());
		}
		return temp;
	}
	
	@GetMapping("/findById/{player_id}")
	public Player findPlayerById(@PathVariable("player_id") int playerId) {
		log.info("Get player by Id");
		Player temp = playerRepository.findById(playerId);
		log.info(temp.toString());
		return temp;
	}
	
	@GetMapping("/findByName/{player_name}")
	public Player findPlayerByName(@PathVariable("player_name") String playerName) {
		String name = playerName.toLowerCase();
		log.info("Get player by name");
		Player temp = playerRepository.findByName(name);
		log.info(temp.toString());
		return temp;
	}
	
	@DeleteMapping("/delete/{player_id}")
	public Player deletePlayer(@PathVariable("player_id") int playerId) {
		Player temp = playerRepository.findById(playerId);
		playerRepository.delete(temp);
		return temp;
	}
	
	@PostMapping(value = "/create/{player_name}")
	public Player createPlayer(@PathVariable("player_name") String player_name) {
		log.info("test test");
		Player temp = new Player();
		temp.setName(player_name);
		return temp;
	}
}
