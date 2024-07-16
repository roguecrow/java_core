package com.chainsys.test;

import java.util.Scanner;

import com.chainsys.model.Company;
import com.chainsys.model.Employee;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name :");
		String companyName = sc.next();
		System.out.println("Enter no. of employees :");
		int noOfEmployees = sc.nextInt();
		int total = noOfEmployees;
		int j=0;
		Employee[] employees = new Employee [noOfEmployees];
		System.out.println("Please Enter Employee Details");
		while(total != 0) {
			System.out.println("Enter employee id :");
			int id = sc.nextInt();
			System.out.println("Enter employee name :");
			String name = sc.next();
			System.out.println("Enter employee designation :");
			String designation = sc.next();
			System.out.println("Enter employee salary :");
			int Salary = sc.nextInt();
			total--;
			Employee employee = new Employee(id, name, designation, Salary);
			employees[j++] = employee;
		}
		
		Company company = new Company(companyName, employees, noOfEmployees);
		
		System.out.println("enter designation :");
		String empDesignation = sc.next();
		System.out.println("Average salary :" +company.getAverageSalary());
		System.out.println("Max salary :"+ company.getMaxSalary());
		company.getEmployeesByDesignation(empDesignation);
	}

}
