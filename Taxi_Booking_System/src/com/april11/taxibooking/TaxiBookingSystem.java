package com.april11.taxibooking;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class TaxiBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance ,cabType;
		double minAmount = 2000.0 , fareAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distance :");
		distance = sc.nextInt();
		System.out.println("select the Cab type number :\r\n" +"1. Micro (Rs.10 per km)\r\n"
				+ "2. Mini (Rs.15 per km)\r\n"
				+ "3. Prime (Rs.20 per km)");
		cabType = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		try {
			if(validate.intInputChecker(cabType) && validate.intInputChecker(distance)) {
				CabFareCalculator calculate = new CabFareCalculator();
				fareAmount = calculate.fareCalculator(distance, cabType);
				System.out.println("total fare amount :" + fareAmount);
				if(fareAmount > minAmount) {
					System.out.println("Congrats !!! you are eligible for DISCOUNTS.");
					System.out.println("Total Fare with added Discount :" + calculate.FinalAmountCalculator(sc,fareAmount));

				}
				else {
					System.out.println("Total Fare :" + fareAmount);

				}
			}
			else {
				System.out.println("Enter a valid Input");
				main(null);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Error : enter a valid input");
			main(null);
			
		}
		
	}

}
