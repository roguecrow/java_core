package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter a number :");
		row = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(row)) {
			for(int i = 1;i<=row;i++) {
				for(int j = 1 ;j<= i;j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Enter a valid input");
		}
	
	}

}
