package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class OddEvenFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,j=0,k=0;
		System.out.println("enter a number :");
		number = sc.nextInt();
		int[] arrOdd = new int[number/2+1],arrEven = new int[number/2];
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(number)) {
			for(int i=1;i<=number;i++) {
				if(i%2!=0) {
					arrOdd[j++] = i;
				}
				else {
					arrEven[k++] = i;
				}
			}
			System.out.println("Odd :");
			for(int i=0;i<j;i++) {
				System.out.print(arrOdd[i]+" ");
			}
			System.out.println("\nEven :");

			for(int i=0;i<k;i++) {
				System.out.print(arrEven[i]+ " ");
			}
			
			System.out.println("\nCube of given no: " + number*number*number);
		}
		else {
			System.out.println("Provide a valid input");
			main(null);
		}
	}

}
