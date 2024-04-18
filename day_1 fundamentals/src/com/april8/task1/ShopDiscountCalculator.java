package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class ShopDiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discount =10;
		int unitPrice = 100;
		int quantity;
		double totalCost;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity :");
		quantity = sc.nextInt();
		totalCost = quantity * unitPrice;
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(quantity)) {
			if(totalCost >= 1000) {
				totalCost -= (totalCost * discount/100);
			}
			
			System.out.println("total Cost :" + totalCost);

		}
		else {
			System.out.println("Enter a valid input");
			main(null);
		}

	}

}
