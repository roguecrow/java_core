package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "saravana";
		char[] arr = name.toCharArray();
		int row ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter a number :");
		row = sc.nextInt();
		int n =0;
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(row)) {
			for(int i =1;i<=arr.length;i++) {
				for(int k = arr.length;k>=i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					if(j == 1 || j == i) {
						if(n!=arr.length) {
							System.out.print(" "+name.charAt(n++));
						}
					}
					else {
						System.out.print("  ");

					}
				}
				System.out.println();
			
			}
		}
		else {
			System.out.println("Enter a valid input");
		}
	
	}

}
