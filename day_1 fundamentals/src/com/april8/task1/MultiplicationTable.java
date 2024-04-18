package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to view table :");
		num = sc.nextInt();
		System.out.println("enter a table end number :");
		end = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if( validate.intInputChecker(num)&& validate.intInputChecker(end)) {
			for(int i = 1;i<=end;i++) {
				System.out.println(i+"*"+num +"=" + (i * num));
			}
		}
		else {
			System.out.println("Provide a valid input");
			main(null);
		}
		
	}
}
