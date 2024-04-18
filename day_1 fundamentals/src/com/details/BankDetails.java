package com.details;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bankName;
		String headmanagerName;
		String location;
		int telephoneNo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bankName :");
		bankName = sc.nextLine();
		// TODO Auto-generated method stub
		System.out.println("Enter telephoneNo :");
		telephoneNo = sc.nextInt();
		System.out.println("Enter headmanagerName :");
		headmanagerName = sc.next();
		System.out.println("Enter location :");
		location = sc.next();	
		
		System.out.println("bankName :" +bankName + "\nheadmanagerName :" +headmanagerName + "\nlocation :" + location + "\ntelephoneNo :" + telephoneNo);

	}

}
