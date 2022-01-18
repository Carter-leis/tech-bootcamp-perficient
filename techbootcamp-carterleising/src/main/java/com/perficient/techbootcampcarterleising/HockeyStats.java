package com.perficient.techbootcampcarterleising;

public class HockeyStats {
	private static int goals;
	private static int assists;
	private static String name;
	private static int shots;
	private static int plusMinus;
	

	public HockeyStats(int numGoals, int numAssists, String newName, int numShots, int valPlusMinus) {
		setGoals(numGoals);
		setAssists(numAssists);
		setName(newName);
		setShots(numShots);
		setPlusMinus(valPlusMinus);
	}
	

	public static int getGoals() {
		return goals;
	}


	public static void setGoals(int goals) {
		HockeyStats.goals = goals;
	}


	public static int getAssists() {
		return assists;
	}


	public static void setAssists(int assists) {
		HockeyStats.assists = assists;
	}


	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		HockeyStats.name = name;
	}

	public static int getShots() {
		return shots;
	}

	public static void setShots(int shots) {
		HockeyStats.shots = shots;
	}

	public static int getPlusMinus() {
		return plusMinus;
	}

	public static void setPlusMinus(int plusMinus) {
		HockeyStats.plusMinus = plusMinus;
	}
}
