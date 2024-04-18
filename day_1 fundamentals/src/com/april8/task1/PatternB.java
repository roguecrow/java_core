package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class PatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		System.out.println("Emter a odd number :");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(row)) {
			for(int k = 1 ;k<row;k+=2) {
				for(int l = k;l<=row;l++) {
					System.out.print(" ");
				}
				for(int n = 1;n<=k;n++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i = 1;i<=row;i+=2) {
				for(int j = 1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int m = i;m<=row;m++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Enter a valid input");
		}


	}

}