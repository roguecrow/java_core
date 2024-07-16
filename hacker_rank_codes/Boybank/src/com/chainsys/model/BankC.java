package com.chainsys.model;

public class BankC implements Bank {
	private double amount = 2000;

	@Override
	public double getBalance() {
		return amount;
	}

}
