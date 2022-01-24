package com.perficient.techbootcampcarterleising.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampcarterleising.Entity.Player;
import com.perficient.techbootcampcarterleising.Repositories.JpaServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	JpaServices jpaServices;
	
	@GetMapping("/getdata")
	public List<Player> getPlayers() {
		List<Player> temp = jpaServices.findAll();
		log.info("Get all players");
		for(Player player: temp) {
			log.info(player.toString());
		}
		return temp;
	}
	
	@GetMapping("/findById/{player_id}")
	public Optional<Player> findPlayerById(@PathVariable("player_id") int playerId) {
		log.info("Get player by Id");
		Optional <Player> temp = jpaServices.findById(playerId);
		log.info(temp.toString());
		return temp;
	}
	
	@GetMapping("/findByName/{player_name}")
	public Optional<Player> findPlayerByName(@PathVariable("player_name") String playerName) {
		String name = playerName.toLowerCase();
		log.info("Get player by name");
		Optional<Player> temp = jpaServices.findByName(name);
		log.info(temp.toString());
		return temp;
	}
	
	@GetMapping("/delete/{player_id}")
	public void deletePlayer(@PathVariable("player_id") int playerId) {
		Optional <Player> temp = jpaServices.findById(playerId);
		jpaServices.deletePlayer(playerId);
	}
	
	@GetMapping("/create/{player_name}")
	public Player createNewPlayer(@PathVariable("player_name") String player_name) {
		log.info("test test");
		Player temp = new Player(50, 0, 0, "Testplayer", 0, 0, 0);
		return jpaServices.createPlayer(temp);
	} 
	
	@GetMapping("/update/{player_name}/{update_col}/{update_num}")
	public Player updateExsistingPlayer(@PathVariable("player_name") String name, @PathVariable("update_col") String col, @PathVariable("update_num") int num) {
		Optional<Player> temp = jpaServices.findByName(name);
		return jpaServices.updatePlayer(temp, col, num);
	}
}
