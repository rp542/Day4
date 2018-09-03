package com.capgemini.day4test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.SalesManager;

public class SalesManagerTest {

	SalesManager sales;

	@BeforeEach
	void setUp() {
		sales = new SalesManager(157817, "priyanka", 10000, 1000);
	}

	@Test
	void testCalculateNetSalaryManager() {
		assertEquals(17000.0, sales.calculateNetSalary(), 0.03);
	}

	@AfterEach
	void tearDown() {
		sales = null;
	}
}