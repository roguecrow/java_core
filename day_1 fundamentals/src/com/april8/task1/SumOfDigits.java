package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(number)) {
			while(number>0) {
				value += number%10;
				number = number/10;
			}
			System.out.println("sum of the number :" + value);
		}

	}

}
