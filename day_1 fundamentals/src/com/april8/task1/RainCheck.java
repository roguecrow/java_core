package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class RainCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserAns;
		double temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Is it raining?[Yes or No] :");
		UserAns = sc.nextLine();
		InputsValidator validate = new InputsValidator();
		
		if(validate.stringInputChecker(UserAns)) {
			if(UserAns.equalsIgnoreCase("Yes") || UserAns.equals("yes")) {
				System.out.println("get an umbrella.");
			}
		}
		else {
			System.out.println("Provide a valid input");
			main(null);
		}
		System.out.println("what's the temperature ?");
		temp = sc.nextDouble();
		if(validate.intInputChecker((int)temp)) {
			if(temp<32) {
				System.out.println("Get a heavy jacket.");
			}
			else if(temp>=32 && temp<=50) {
				System.out.println("Get a light jacket.");
			}
			else {
				System.out.println("No need to wear jacket.");
			}

		}
		else {
			System.out.println("Provide a valid input");
			main(null);
		}
	}

}
