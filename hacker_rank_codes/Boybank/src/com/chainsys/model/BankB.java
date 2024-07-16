package com.chainsys.model;

public class BankB implements Bank{
	private double amount = 1500;

	@Override
	public double getBalance() {
		return amount;
	}

}
