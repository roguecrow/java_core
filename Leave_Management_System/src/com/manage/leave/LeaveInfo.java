package com.manage.leave;

import java.util.Scanner;

public class LeaveInfo {
	
	public static void main(String[] args) {
		LoginCred lc = new LoginCred();
		Scanner sc = new Scanner(System.in);
		LeaveDetails details = new LeaveDetails();
		LeaveModules modules = new LeaveModules();
		InfoValidator val = new InfoValidator();
		// TODO Auto-generated method stub
		System.out.println("************Leave Management System************");
		System.out.println("Please Enter the EmpId :");
		if(lc.loginToYourAccount(details,val.validator(1),sc)) {
			System.out.println("Enter an Option (1 or 2) :");
			System.out.println("1. Apply Leave \n2. Leave History");
			int num = Integer.parseInt(val.validator(1));
			while(true) {
				if(num < 3 && num > 0) {
					switch(num) {
					case 1 :
						modules.applyLeave(details);
						break;
					case 2 :
						modules.showHistory(details.getEmployeeId());
						break;
					}
					break;
				}
				else {
					System.out.println("enter a valid number :");
				}
			}
		}
	}


}
