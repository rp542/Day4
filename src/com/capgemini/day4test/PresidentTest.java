package com.capgemini.day4test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.President;

public class PresidentTest {

	President president;

	@BeforeEach
	void setUp() {
		president = new President(157817, "priyanka", 10000, 1000);
	}

	@Test
	void testCalculateNetSalaryManager() {
		assertEquals(16600.0, president.calculateNetSalary(), 0.03);
	}

	@AfterEach
	void tearDown() {
		president = null;
	}
}