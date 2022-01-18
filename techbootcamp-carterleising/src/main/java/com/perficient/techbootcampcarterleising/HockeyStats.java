package com.perficient.techbootcampcarterleising;

public class HockeyStats {
	private static int goals;
	private static int assists;
	

	public static void main() {
		
		// TODO Auto-generated method stub

	}
	public static void setVal(int numGoals, int numAssists) {
		goals = numGoals;
		assists = numAssists;
	}
	
	public static int getGoals() {
		return goals;
	}
	
	public static int getAssists() {
		return assists;
	}
}
