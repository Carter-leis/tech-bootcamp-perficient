package com.perficient.techbootcampcarterleising.Entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "stats")
public class Player {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "goals")
	private int goals;
	@Column(name = "assists")
	private int assists;
	@Column(name = "name")
	private String name;
	@Column(name = "shots")
	private int shots;
	@Column(name = "pm")
	private int plusMinus;
	@Column(name = "gp")
	private int gp;
	
	@Override
	  public String toString() {
	    return String.format(
	        "Player[id= " + id + ", Name= " + name + ", Goals= " + goals + ", Assists= " + assists + ", Shots= " + shots + "]");
	  }
	
	public Player() {}
	
	public Player(int id, int numGoals, int numAssists, String newName, int numShots, int gp, int valPlusMinus) {
		this.id = id;
		this.assists = numAssists;
		this.goals = numGoals;
		this.name = newName;
		this.shots = numShots;
		this.plusMinus = valPlusMinus;
		this.gp = gp;
	}
	public int getGoals() {
		return goals;
	}

	public int getAssists() {
		return assists;
	}

	public String getName() {
		return name;
	}

	public int getShots() {
		return shots;
	}

	public int getGp() {
		return gp;
	}
	
	public int getPlusMinus() {
		return plusMinus;
	}
	
	public int getId() {
		return id;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShots(int shots) {
		this.shots = shots;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}
	
	public void setPlusMinus(int plusMinus) {
		this.plusMinus = plusMinus;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
