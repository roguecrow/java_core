package com.chainsys.test;

import java.util.Scanner;

import com.chainsys.model.BankA;
import com.chainsys.model.BankB;
import com.chainsys.model.BankC;

public class MyBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("please choose your bank : \n1.bankA\n2.bankB\n3.bankC\n0 to exit");
			int val = sc.nextInt();
			double amount=0;
			if(val == 1) {
				BankA bank = new BankA(); 
				amount = bank.getBalance();
			}
			else if(val ==2) {
				BankB bank = new BankB();
				amount = bank.getBalance();
			}
			else if(val == 3) {
				BankC bank = new BankC();
				amount = bank.getBalance();
			}
			else if(val == 0) {
				break;
			}
			else {
				System.out.println("enter a valid number :");
			}
			System.out.println(amount);
		}
	}

}
