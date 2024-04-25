package com.manage.leave;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginCred {
	boolean createEmpDetails(Scanner sc,int n,LeaveDetails details) {
		String userInput,
		 userNamePattern = "^[A-Za-z]+{8,20}$",
		 empIdPattern = "^[0-9]+{6,8}$";
		while(sc.hasNext()) {
			userInput = sc.nextLine();
			if(n==1) {
				if(userInput.matches(userNamePattern)) {
					details.setUsername(userInput);
					break;
				}
				System.out.println("Enter valid User Name.");
				System.out.println("use only alphabets");
			}
			else {
				if(userInput.matches(empIdPattern)) {
					details.setEmployeeId(userInput);
					break;
				}
				System.out.println("Enter valid employee Id :");
				 System.out.println("Atleast enter six numbers");
			}
		}
		return false;
	}
	
	boolean loginToYourAccount(LeaveDetails details, String id, Scanner sc) {
	    InfoValidator val = new InfoValidator();
	    try {
	        File f1 = new File("C:\\Users\\babu3560\\eclipse-workspace\\Leave_Management_System\\leave_Data.txt");
	        if (!f1.exists() || f1.length() == 0) {
	            System.out.println("No data found. Please create an account to continue.");
	            System.out.println("Press 1 to create an account:");
	            if (Integer.parseInt(val.validator(1)) == 1) {
	                System.out.println(" ------- Employee SignUp Page -------");
	                System.out.println("Enter the username:");
	                createEmpDetails(sc, 1, details);
	                System.out.println("Enter the EmpId:");
	                createEmpDetails(sc, 2, details);
	                System.out.println("Account created successfully.");
	                return true;
	            } else {
	                System.out.println("Quitting from the Application...");
	                System.exit(0);
	            }
	        } else {
	            Scanner dataReader = new Scanner(f1);
	            while (dataReader.hasNextLine()) {
	                String fileData = dataReader.nextLine();
	                String[] fields = fileData.split(",");
	                String empId = fields[0];
	                String empName = fields[1];
	                if (empId.equals(id)) {
	                    details.setEmployeeId(id);
	                    details.setUsername(empName);	                    
	                    return true;
	                }
	            }
	            dataReader.close();
	            System.out.println("Employee not found. Please create an account to continue.");
	            System.out.println("Press 1 to create an account:");
	            if (Integer.parseInt(val.validator(1)) == 1) {
	                System.out.println(" ------- Employee SignUp Page -------");
	                System.out.println("Enter the username:");
	                createEmpDetails(sc, 1, details);
	                System.out.println("Enter the EmpId:");
	                createEmpDetails(sc, 2, details);
	                System.out.println("Account created successfully.");
	                return true;
	            } else {
	                System.out.println("Quitting from the Application...");
	                System.exit(0);
	            }
	        }
	    } catch (FileNotFoundException exception) {
	        System.out.println("Unexpected error occurred!");
	        exception.printStackTrace();
	    }
	    return false;
	}
	
}