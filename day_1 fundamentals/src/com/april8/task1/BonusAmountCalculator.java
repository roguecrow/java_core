package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class BonusAmountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus = 5;
		double salary ,bonusAmount = 0;
		int service;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary :");
		salary = sc.nextDouble();
		System.out.println("enter service");
		service = sc.nextInt();
		InputsValidator validate = new InputsValidator();

		if(validate.intInputChecker(service) && validate.intInputChecker((int)salary)) {
		
			if(service >=5) {
				bonusAmount = salary * bonus/100;
			}
			
			System.out.println("The employee Bonus amount :" +bonusAmount);
			System.out.println("Employee Total salary :" + (salary + bonusAmount));
		}
		else {
			System.out.println("Provide valid input");
			main(null);
		}
	}

}
