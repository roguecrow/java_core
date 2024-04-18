package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class EvenDigitFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(number)){
			
			while(number!=0) {
				int digit = number % 10;
				if(digit % 2 == 0) {
					System.out.println(digit + " number is Even.");
				}
				number = number /10;
			}
		}
		else {
			System.out.println("Provide a valid input");
			main(null);
		}
	}

}
