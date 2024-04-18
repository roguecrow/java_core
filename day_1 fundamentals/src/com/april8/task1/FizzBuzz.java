package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start and end number :");
		start = sc.nextInt();
		end = sc.nextInt();
		InputsValidator validate = new InputsValidator();
	if(validate.intInputChecker(start) && validate.intInputChecker(end)) {
		for(int i = start ;i<=end;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz ");
			}
			else {
				if(i%3==0) {
					System.out.println("Fizz ");
				}
				else if(i%5==0) {
					System.out.println("buzz ");
				}
				else {
					System.out.println(i+" ");
				}
			}
		
		}
	}
	else {
		System.out.println("Enter a valid input.");
	}
	}

}
