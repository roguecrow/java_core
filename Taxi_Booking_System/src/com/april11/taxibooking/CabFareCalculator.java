package com.april11.taxibooking;

import java.util.Scanner;

public class CabFareCalculator {
	
	double fareCalculator (int distance , int type) {
		double fare;
		int amountperKm = (type == 1) ? 10 : (type == 2) ? 15 : 20;
		fare = distance * amountperKm;
		return fare;
	}
	
	
	   double FinalAmountCalculator(Scanner sc ,double fare) {
	    	String code;
	    	if(fare > 2000 && fare <5000) {
				System.out.println("Here are the Coupen codes you can Avail : \r\n  COUP_2 means 2% ");
				System.out.println("enter the code :");
				while(sc.hasNext()) {
					code = sc.next();
					if(code.equalsIgnoreCase("COUP_2")) {
		                System.out.println("Discount amount :"+ (fare * 0.02));
		                fare -= fare * 0.02;
		                break;
		           }
		           else {
		           	System.out.println("Invalid Code. Enter the code again: ");
		           }
				}
			}
	    	else {
	    		System.out.println("Here are the Coupen codes you can Avail : \r\nCOUP_2 means 2% \r\nCOUP_5 means 5%");
				System.out.println("enter the code :");
				while(sc.hasNext()) {
					code = sc.next();
		            if(code.equalsIgnoreCase("COUP_2")) {
		                 System.out.println("Discount amount "+ fare * 0.02);
		                 fare -= fare * 0.02;
		                 break;
		            }
		            else if(code.equalsIgnoreCase("COUP_5")){
		                 System.out.println("Discount amount :"+ fare * 0.05);
		                 fare -= fare * 0.05;
		                 break;
		                 
		            }
		            else {
		            	System.out.println("Invalid Code. Enter the code again: ");
		            }
				}
	        }        
	        return fare;
	    }
}
