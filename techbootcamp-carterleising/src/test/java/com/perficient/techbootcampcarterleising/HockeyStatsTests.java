package com.perficient.techbootcampcarterleising;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HockeyStatsTests {
	HockeyStats stats;
	
	@BeforeEach
	void setUp() {
		HockeyStats.setVal(4, 10);
	}
	
	@Test
	@DisplayName("Goals pass")
	void testGoalsPass() {
		assertEquals(4, HockeyStats.getGoals(), "goals should equal");
	}
	
	@Test
	@DisplayName("Goals fail")
	void testGoalsFail() {
		assertEquals(6, HockeyStats.getGoals(), "goals should equal");
	}
}
