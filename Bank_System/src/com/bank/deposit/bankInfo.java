package com.bank.deposit;

import java.util.Random;
import java.util.Scanner;

import com.emp.details.InputsValidator;

public class bankInfo {
	static String validator(int n) {
		Scanner sc = new Scanner(System.in);
		InputsValidator validate = new InputsValidator();
		int num;
		String str = null;
		while(sc.hasNext()) {
			if(n ==1) {
					num = sc.nextInt();
					 if(!validate.intInputChecker(num)) {
						 System.out.println("Enter a valid Integer :");
					 }
					 else {
						 return String.valueOf(num);
					 }
			}
			else if(n == 2) {
				str = sc.next();
				 if(!validate.stringInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else if(n==3) {
				str = sc.next();
				 if(!validate.longNumberInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else {
				str = sc.next();
				 if(!validate.IfscCodeInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
		}
		return str;
	}
	
	static String accountNoGenerator() {
		Random random = new Random();
		long accountNo =  random.nextLong(9999999999L,999999999999L);
		return "987"+Long.toString(accountNo);
	}
	static double balanceGenerator() {
		Random random = new Random();
		double balance =  random.nextInt(99,9999);
		return balance;
	}
	
	
	static void getUserDetails(BankDetails details) {
		System.out.println(" Hii !!!, \nPlease enter your Details for depositing amount ");
		System.out.println("enter Customer Name :");
		details.setName(validator(2));
		details.setAccountNo(accountNoGenerator());
		System.out.println("enter Location:");
		details.setLocation(validator(2));
		System.out.println("enter Mobile No. :");
		details.setMobileNo(validator(3));
		System.out.println("enter IFSC code :");
		details.setIfsc(validator(4));
		System.out.println("Please Enter the Depositer Name :");
		details.setDepositerName(validator(2));
		System.out.println("enter Amount you want to Deposit :");
		details.setDepositAmount(Integer.parseInt(validator(1)));
		details.setAccountBalance(balanceGenerator());
	}
	
	static void printUserDetails(BankDetails details) {
		System.out.println("Your Account NO. :" + details.getAccountNo()+"\n"+
	             "Customer Name : "+ details.getName()+"\n"+"Mobile NO. "+details.getMobileNo()+"\n"+
					"IFSC code : "+details.getIfsc()+"\n"+"Bank Location : "+details.getLocation()+"\n"+
	             "Account Balance :"+details.getAccountBalance()+"\nDeposited Amount : "+details.getDepositAmount());
	}
	
	public static void main(String [] args) {
		BankDetails details = new BankDetails();
		BankCharges charges = new BankCharges();
		getUserDetails(details);
		printUserDetails(details);
		charges.deposit(details.getDepositAmount(), details.getAccountNo(), details.getDepositerName(),details.getAccountBalance());
		charges.deposit(details.getDepositAmount(), details.getIfsc(), details.getMobileNo(), details.getDepositerName(),details.getAccountBalance());
		charges.deposit(details.getDepositAmount(),details.getAccountNo(),details.getAccountBalance());
		//charges.deposit(details.getDepositAmount(), details.getAccountNo(),details.getAccountBalance());
		//showAvailableSavingPlans();
		
	}
}
