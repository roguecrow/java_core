package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class PatternC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A number :");
		int row = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		
		if(validate.intInputChecker(row)){
			
			for(int i= row;i>=1;i--) {
				for(int j = i;j<=row;j++) {
					System.out.print(" ");
				}
				for(int k = 1;k<=(2*i-1);k++) {
					if(k%2==0) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Enter a valid input");
			main(null);
		}

	}

}

