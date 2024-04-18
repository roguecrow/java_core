package com.april8.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AvgAndProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int adder = 0,count = 0,product = 1;
		String number;
		String matcher = "^[^0-9Qq]+$";
		System.out.println("Enter the a number or press \"Q or q\" to quit");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			number = sc.next();
			try {
				if(number.equalsIgnoreCase("Q")) {
					break;
				}
				if(number.matches(matcher)) {
					System.out.println("Enter a valid input");
				}
				else {
					adder += Integer.parseInt(number);
					product *= adder; 
					count++;
					//System.out.println(adder);
					System.out.println("Enter the a number or press \"Q or q\" to quit");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Error : enter a valid input");
				
			}
		}
		if(count>0) {
			System.out.println("Average = " + (adder/count));
			System.out.println("Product = " + (product));
		}
		else {
			System.out.println("No number is entered");
		}
			
		sc.close();
	}

}
