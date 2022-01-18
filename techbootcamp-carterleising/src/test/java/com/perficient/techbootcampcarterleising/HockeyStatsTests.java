package com.perficient.techbootcampcarterleising;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HockeyStatsTests {
	private static HockeyStats stats;
	private static final Logger logger = LogManager.getLogger(HockeyStats.class);
	
	@BeforeEach
	void setUp() {
		stats = new HockeyStats(4, 10, "Carter", 37, 5);
		
	}
	
	@Test
	@DisplayName("Goals pass")
	void testGoalsPass() {
		logger.debug("logging in player goals {}", stats.getGoals());
		assertEquals(4, stats.getGoals(), "goals should equal");
	}
	
	@Test
	@DisplayName("Goals fail")
	void testGoalsFail() {
		assertNotEquals(6, stats.getGoals(), "goals should equal");
	}
	
	@Test
	@DisplayName("Assists pass")
	void testAssistsPass() {
		logger.debug("logging in player assists {}", stats.getAssists());
		assertEquals(10, stats.getAssists(), "goals should equal");
	}
	
	@Test
	@DisplayName("Assists fail")
	void testAssistsFail() {
		assertNotEquals(6, stats.getAssists(), "goals should equal");
	}
}
