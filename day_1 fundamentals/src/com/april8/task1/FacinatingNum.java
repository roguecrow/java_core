package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class FacinatingNum {
	
	static boolean facinateFinder(int num) {
	    String concatenated = String.valueOf(num) + String.valueOf(num * 2) + String.valueOf(num * 3);
	    if (concatenated.length() != 9) {
	        return false;
	    }
	    for (int i = 1; i <= 9; i++) {
	        if (!concatenated.contains(String.valueOf(i))) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		String facinate = "123456789";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num 1 :");
		num1 = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(num1)) {
			if(facinateFinder(num1)) {
				System.out.println("facinating number");
			}
			else {
				System.out.println("not facinating number");
			}
		}
		else {
			System.out.println("enter a valid input");
		}
	}
}
