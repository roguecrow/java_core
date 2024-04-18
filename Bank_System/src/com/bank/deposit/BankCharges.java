package com.bank.deposit;

public class BankCharges extends AbcBank{
	@Override
	
	void deposit(double amount, String accountNo,double balance) {
		System.out.println("charges for depositing in the account is 2%");
		 balance = balance + amount  - (amount * 0.02);
		System.out.println("your balance after taking charges : " + balance);
	}
}
