package com.april10.task2;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class TeenNumberChecker {
	
	static boolean hasTeen(int para1, int para2,int para3){
		if(para1 >13 && para1<19) {
			return true;
		}
		else if(para2 >= 13 && para2 <= 19) {
			return true;
		}
		else if(para3 >= 13 && para3 <= 19) {
			return true;
		}
		return false;
	}
	static boolean isTeen (int num) {
		if(num >= 13 && num <= 19) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teen1,teen2,teen3,teen;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age of 3 teen  :");
		teen1 = sc.nextInt();
		teen2 = sc.nextInt();
		teen3 = sc.nextInt();
		System.out.println("enter one teen age :");
		teen = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(teen) || validate.intInputChecker(teen1)||
				validate.intInputChecker(teen2) || validate.intInputChecker(teen3)) {
			System.out.println(hasTeen(teen1,teen2,teen3));
			System.out.println(isTeen(teen));
		}
		else {
			System.out.println("enter a valid input.");
			main(null);
		}
	}

}
