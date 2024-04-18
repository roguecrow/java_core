package com.april8.task1;

import java.util.Scanner;

public class LoginAuth {
	
	static boolean inputChecker(Scanner sc,int n){
		String userInput,
		 userNamePattern = "^[A-Za-z]+$",
		 emailIdPattern = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$",
		 passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+.])(?=.*\\d).{8,}$"; //^(?=.[A-Z])(?=.[0-9])(?=.*[^A-Za-z0-9]).{8,}$
		while(sc.hasNext()) {
			userInput = sc.nextLine();
			if(n==1) {
				if(userInput.matches(userNamePattern)) {
					break;
				}
				System.out.println("Enter valid User Name.");
				System.out.println("use only alphabets");
			}
			else if(n==2) {
				if(userInput.matches(emailIdPattern)) {
					break;
				}
				System.out.println("Enter valid Mail id.");
			}
			else {
				if(userInput.matches(passwordPattern)) {
					break;
				}
				System.out.println("Enter valid Password :");
				 System.out.println("Atleast enter one upper & lower character"
				 		+ " \nOne special character "
				 		+ "\nAtleast one number");
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username :");
		inputChecker(sc, 1);
		System.out.println("Enter the EmailId");
		inputChecker(sc, 2);
		System.out.println("Enter the Password :");
		inputChecker(sc, 3);
		System.out.println("Successfuly logged in");
		
	}

}
