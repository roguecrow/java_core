package com.bank.deposit;

public class AbcBank {
	void deposit(double amount, String accountNo,double balance) {
		 balance = balance + amount;
		System.out.println("your balance : " + balance);
	}
	
	void deposit(double amount, String accountNo, String depositerName,double balance) {
		balance =  balance +amount;
		System.out.println("your balance : " + balance + ", amount deposited by: " + depositerName);
	}
	
	void deposit(double amount, String IFSC, String mobileNo, String depositerName,double balance) {
		int interest = 100;
		 balance = balance + amount + interest;
		System.out.println("your balance : " + balance + " Mobile NO. "+ mobileNo + ", amount deposited by: " + depositerName );
	}
	
	void showAvailableSavingPlans() {
		
	}
}
