package com.details;

import java.util.Scanner;

public class HospitalDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hospitalName;
		String headDoctorName;
		String speciality;
		int telephoneNo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the hospitalName :");
		hospitalName = sc.next();
		// TODO Auto-generated method stub
		System.out.println("Enter telephoneNo :");
		telephoneNo = sc.nextInt();
		System.out.println("Enter headDoctorName :");
		headDoctorName = sc.next();
		System.out.println("Enter speciality :");
		speciality = sc.next();	
		
		System.out.println("hospitalName :" +hospitalName + "\ntelephoneNo :" +telephoneNo + "\nheadDoctorName :" + headDoctorName + "\nspeciality :" + speciality);

	}

}
