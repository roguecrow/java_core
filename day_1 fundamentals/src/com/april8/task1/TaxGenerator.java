package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class TaxGenerator {

    static double taxCalculator(double grossSalary, double savings) {
        double taxableIncome = grossSalary - Math.min(savings, 100000);

        double tax = 0.0;
        if (taxableIncome <= 100000) {
            tax = 0;
        } else if (taxableIncome <= 200000) {
            tax = 0.1 * (taxableIncome - 100000);
        } else if (taxableIncome <= 500000) {
            tax = (0.1 * 100000) + (0.2 * (taxableIncome - 200000));
        } else {
            tax = (0.1 * 100000) + (0.2 * 300000) + (0.3 * (taxableIncome - 500000));
        }

        return tax;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grossSalary,totalSaving;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gross salary AMOUNT :");
		grossSalary = sc.nextDouble();
		System.out.println("enter Total Saving Amount :");
		totalSaving =sc.nextDouble();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker((int)grossSalary) && validate.intInputChecker((int)totalSaving)) {
			System.out.println("Tax amount : " +taxCalculator(grossSalary,totalSaving));
		}
		else {
			System.out.println("Enter a valid input.");
			main(null);
		}
	}

}

