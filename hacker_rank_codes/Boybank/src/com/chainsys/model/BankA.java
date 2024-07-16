package com.chainsys.model;

public class BankA implements Bank {

	private double amount = 1000;
	@Override
	public double getBalance() {
		return amount;
	}
}
