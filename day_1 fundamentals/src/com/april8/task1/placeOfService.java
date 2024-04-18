package com.april8.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class placeOfService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char sex , maritalStatus;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter age :");
			age = sc.nextInt();
			System.out.println("Enter Sex :");
			sex = sc.next().charAt(0);
			System.out.println("Enter Marital Status :");
			maritalStatus = sc.next().charAt(0);
			InputsValidator validate = new InputsValidator();
			if(validate.intInputChecker(age) && validate.stringInputChecker((String.valueOf(sex))) && validate.stringInputChecker((String.valueOf(maritalStatus)))) 
			{
				
				if(sex =='F') {
					System.out.println("You are allocated to work only in urban areas");
				}
				else if(sex == 'M' && (age<=40 && age>=20)) {
					System.out.println("You can work in anywhere");
				}
				else if(sex == 'M' &&(age<=60 && age>=40)) {
					System.out.println("You will work in urban areas only.");
				}
				else if(age<20 || age>60) {
					System.out.println("Enter a correct age above 19");
				}
			}
			else {
				System.out.println("enter a valid Input");
				main(null);
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Error : enter a valid input");
			
		}
		
	}

}
