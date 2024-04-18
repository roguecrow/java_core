package com.details;

import java.util.Scanner;

public class StudentsDetails {
	
	

	public static void main(String[] args) {
		 int rollNo;
		 String name;
		 char sec;
		 String stream;
		 int mobileNo;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the RollNo :");
		rollNo = sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println("Enter student name :");
		name = sc.nextLine();
		System.out.println("Enter sec :");
		sec = sc.next().charAt(0);
		System.out.println("Enter Stream :");
		stream = sc.next();
		System.out.println("Enter mobileNo :");
		mobileNo = sc.nextInt();
	
		System.out.println("rollNo :" +rollNo);
		System.out.println("NAME :" +name);
		System.out.println("sec :" +sec);
		System.out.println("sec :" +stream);
		System.out.println("sec :" +mobileNo);

	}

}


//public class StudentsDetails {
//	
//	 int rollNo;
//	 String name;
//	 char sec;
//	 String stream;
//	 int mobileNo;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		StudentsDetails student1 = new StudentsDetails();
//		StudentsDetails student2 = new StudentsDetails();
//		
//		System.out.println("Enter the RollNo :");
//		student1.rollNo = sc.nextInt();
//		// TODO Auto-generated method stub
//		System.out.println("Enter student name :");
//		student1.name = sc.next();
//		System.out.println("Enter sec :");
//		student1.sec = sc.next().charAt(0);
//		System.out.println("rollNo :" +student1.rollNo);
//		System.out.println("NAME :" +student1.name);
//		System.out.println("sec :" +student1.sec);	
//
//	}
//
//}