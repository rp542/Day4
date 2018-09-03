package com.capgemini.day4test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee;

public class EmployeeTest {

	Employee employee;

	@BeforeEach
	void setUp() {
		employee = new Employee(157817, "priyanka", 10000, 1000);
	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(14600.0, employee.calculateNetSalary(), 0.03);
	}

	@AfterEach
	void tearDown() {
		employee = null;
	}
}