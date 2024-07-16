package com.chainsys.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.model.Employee;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total no of employees:");
		int length = sc.nextInt();
		int k =0;
		String branchFromUser = null;
		Employee[] employees = new Employee [length];
		System.out.println("Please enter employee details :");
		while(length !=0) {
			System.out.println("Enter Emp Id :");
			int id = sc.nextInt();
			System.out.println("Enter emp name :");
			String name = sc.next();
			System.out.println("enter branch :");
			String branch = sc.next();
			System.out.println("enter rating :");
			double rating = sc.nextDouble();
			System.out.println("enter y / n for transport :");
			String trans = sc.next();
			boolean comTransport;
			if(trans.equalsIgnoreCase("y")) {
			    comTransport = true;
			}
			else {
				comTransport = false;
			}
			length--;
			Employee employee = new Employee(id, name, branch, rating, comTransport);
			employees[k++] = employee;
		}
		
		System.out.println("enter branch name to get employee count who are using company transport :");
		branchFromUser = sc.next();
		int count =  findCountOfEmployeesUsingCompTransport(employees,branchFromUser);
		if(count>0) {
			System.out.println("no of employee using company transport -" +count);
		}
		else {
			System.out.println("No such Employees");
		}
		Employee secondHighestEmp = findEmployeeWithSecondHighestRating(employees);
		if(secondHighestEmp != null) {
			System.out.println("THE second highest rating :"+secondHighestEmp.getEmployeeId() +" " +secondHighestEmp.getName());
		}
		else {
			System.out.println("All Employees using company transport");

		}
		
	}

	private static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {	
		double highest=0;
		for(Employee empDetails : employees) {
			if(empDetails.getRating() > highest && empDetails.isCompanyTransport()) {
				highest = empDetails.getRating();
			}
		}
		return secondHighestFinder(employees, highest);
	}
	
	static Employee secondHighestFinder(Employee[] employees,double highest) {
		double secondHighest = 0;
		Employee emp = null;
		for(Employee empDetails : employees) {
			if(empDetails.getRating() > secondHighest && empDetails.isCompanyTransport() && empDetails.getRating()!= highest) {
					secondHighest = empDetails.getRating();
					if(empDetails.getRating() == secondHighest) {
						emp = empDetails;
					}
				}	
		}
		return emp;
		
	}

	private static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branchFromUser) {
		int counter = 0;
		for(Employee empDetails : employees) {
			if(empDetails.getBranch().equalsIgnoreCase(branchFromUser) && empDetails.isCompanyTransport()) {
				counter++;
			}
		}
		return counter;
	}

}
