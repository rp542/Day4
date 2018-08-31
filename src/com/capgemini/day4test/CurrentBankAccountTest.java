package com.capgemini.day4test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.CurrentBankAccount;



class CurrentBankAccountTest {
	
	CurrentBankAccount cbaccount;
	
	@BeforeEach
	void setUp() {
		cbaccount = new CurrentBankAccount("John Doe",20000.0, 2000.0);
    }
	@Test
	void testWithdraw() {
		assertEquals(5000, cbaccount.withdraw(15000));
    }
	@Test
	void testDeposit() {
		assertEquals(25000, cbaccount.deposit(5000));
	}

	@AfterEach
	void tearDown() {
		cbaccount = null;
	}

}
