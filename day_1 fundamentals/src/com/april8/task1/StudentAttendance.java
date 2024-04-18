package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class StudentAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attendanceLimit = 75;
		double ClassesHeld ,ClassesAttended,attendendClass;
		char cause;
		Scanner sc  = new Scanner(System.in);
		InputsValidator validate = new InputsValidator();

		System.out.println("Enter the number of class held :");
		ClassesHeld = sc.nextDouble();
		System.out.println("Enter the number of class attended :");
		ClassesAttended = sc.nextDouble();
		
		while(ClassesAttended > ClassesHeld) {
			System.out.println("class atterned cannot be geater than class held");
			System.out.println("Enter the number of class attended again :");
			ClassesAttended = sc.nextDouble();

		}
		System.out.println("if you has medical cause or not ( 'Y' or 'N' )");
		cause = sc.next().charAt(0);
		
		if(validate.intInputChecker((int)ClassesHeld) && validate.intInputChecker((int)ClassesAttended) 
				&& validate.stringInputChecker(String.valueOf(cause))) {
			
			if(cause == 'Y') {
				System.out.println("allowed to sit in the Exam Hall");
			}
			else 
			{
				attendendClass = (ClassesAttended/ClassesHeld*100);
				System.out.println(attendendClass);
				if(attendendClass >= attendanceLimit ) {
					System.out.println("allowed to sit in the Exam Hall");
					}
				else {
					System.out.println("Not Allowed to sit in the Exam Hall");
					}
				}
		}
		else {
			System.out.println("enter a valid Input");
			main(null);
		}

	}

}
