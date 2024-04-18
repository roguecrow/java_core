package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class Equationsolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Start and end number :");
		start = sc.nextInt();
		end = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(start) && validate.intInputChecker(end)) {
			for(int y = start;y<= end; y++) {
				int ans = (2 * (y*y) + y + 5);
				System.out.println(ans);
			}	
		}
		else {
			System.out.println("Enter a valid number !");
		}
	}
}
