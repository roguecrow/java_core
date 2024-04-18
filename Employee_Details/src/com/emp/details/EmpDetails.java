package com.emp.details;

import java.util.Scanner;

public class EmpDetails {
	static String validator(int n) {
		Scanner sc = new Scanner(System.in);
		InputsValidator validate = new InputsValidator();
		int num;
		String str = null;
		while(sc.hasNext()) {
			if(n ==1) {
					num = sc.nextInt();
					 if(!validate.intInputChecker(num)) {
						 System.out.println("Enter a valid Integer :");
					 }
					 else {
						 return String.valueOf(num);
					 }
			}
			else if(n == 2) {
				str = sc.next();
				 if(!validate.stringInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
			else {
				str = sc.next();
				 if(!validate.mailInputChecker(str)) {
					 System.out.println("enter a valid input :");
				 }
				 else {
					 return str;
				 }
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmployeeInfo details = new EmployeeInfo(1,"qwerty","qwerty123@gmail.com","madurai",123456789,2,12000.00,"manager");
		EmployeeInfo details = new EmployeeInfo();
		System.out.println("enter empId :");
		details.setEmpId(Integer.parseInt(validator(1)));
		System.out.println("enter Employee Name :");
		details.setEmpName(validator(2));
		System.out.println("enter Exprience:");
		details.setExperience(Integer.parseInt(validator(1)));
		System.out.println("enter Location :");
		details.setLocation(validator(2));
		System.out.println("enter employee Email :");
		details.setMailId(validator(3));
		System.out.println("enter Phone No. :");
		details.setPhoneNo(Integer.parseInt(validator(1)));
		System.out.println("enter Salary :");
		details.setSalary(Integer.parseInt(validator(1)));
		System.out.println("Enter Desigination :");
		details.setDesigination(validator(2));
		
		System.out.println(details.getDesigination()+"\n"+
             details.getEmpId()+"\n"+details.getEmpName()+"\n"+
				details.getExperience()+"\n"+details.getLocation()+"\n"+
             details.getMailId()+"\n"+details.getPhoneNo()+"\n"+details.getSalary());
	}

}
