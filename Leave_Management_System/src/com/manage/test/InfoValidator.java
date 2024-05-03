package com.manage.test;

import java.util.Scanner;

import com.emp.details.InputsValidator;

public class InfoValidator {
    String validator(int n) {
		Scanner sc = new Scanner(System.in);
		InputsValidator validate = new InputsValidator();
		int num;
		String str = null;
		while(sc.hasNext()) {
			if(n == 1) {
					num = sc.nextInt();
					 if(!validate.intInputChecker(num)) {
						 System.out.println("Enter a valid Integer :");
					 }
					 else {
						 return String.valueOf(num);
					 }
			}
			else if(n == 2) {
				str = sc.next();
				 if(!validate.stringInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else if(n==3) {
				str = sc.next();
				 if(!validate.longNumberInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else if(n==4) {
				str = sc.next();
				 if(!validate.dateInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else {
				str = sc.next();
				 if(!validate.IfscCodeInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
		}
		return str;
	}
	
}
