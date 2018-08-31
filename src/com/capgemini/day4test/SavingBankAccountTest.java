package com.capgemini.day4test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.BankAccount;
import com.capgemini.day4.SavingBankAccount;

class SavingBankAccountTest extends BankAccount {
	
	SavingBankAccount sbaccount;
	
	@BeforeEach
	void setUp() {
		sbaccount = new SavingBankAccount("John Doe",20000.0, true);
    }
	@Test
	void testWithdraw() {
		assertEquals(5000, sbaccount.withdraw(15000));
    }
	@Test
	void testDeposit() {
		assertEquals(25000, sbaccount.deposit(5000));
	}

	@AfterEach
	void tearDown() {
		sbaccount = null;
	}

}
