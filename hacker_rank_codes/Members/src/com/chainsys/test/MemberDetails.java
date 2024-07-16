package com.chainsys.test;

import java.util.Scanner;

import com.chainsys.model.Employee;
import com.chainsys.model.Manager;
import com.chainsys.model.Member;

public class MemberDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		String name = sc.next();
		System.out.println("enter age :");
		int age = sc.nextInt();
		System.out.println("enter phone number :"); 
		long phone  = sc.nextLong();
		System.out.println("enter address :");
		String address = sc.next();
		System.out.println("enter salary :");
		double salary = sc.nextDouble();
		System.out.println("enter specialization :");
		String specialization = sc.next();
		System.out.println("enter department :");
		String department = sc.next();
		
		Employee member = new Employee(name, age, phone, address, salary, specialization, department);
		System.out.println("employee details :");
		System.out.println("name : "+member.getName() +" age :" + member.getAge()+" phone :" + member.getPhoneNumber() +" address :" + member.getAddress()+" salary :" + member.getSalary()+" specialization :" + member.getSpecialization()+" department :" + member.getDepartment());
		Manager member1 = new Manager(name, age, phone, address, salary, specialization, department);
		System.out.println("manager details :");
		System.out.println("name : "+member1.getName() +" age :" + member1.getAge()+" phone :" + member1.getPhoneNumber() +" address :" + member1.getAddress()+" salary :" + member1.getSalary()+" specialization :" + member1.getSpecialization()+" department :" + member1.getDepartment());
	}

}
