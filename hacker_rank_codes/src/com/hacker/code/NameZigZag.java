package com.april8.task1;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class PatternC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name :");
		String name = sc.next();
		int row  = name.length();
		
		for(int i = 1;i<=row;i++) {
			int m=0;
			int n=1;
			for(int k = 1; k<=i;k++) {
				System.out.print(" ");
			}
			for(int j = row;j>=i;j--) {
				if(i == 1 && (i+j) % 2 != 0 && m<row) {
					System.out.print(" "+name.charAt(m));
					m=m+2;
				}
				else if(i == 2 && (i+j) % 2 == 0 && n<row) {
					System.out.print(" "+name.charAt(n));
					n=n+2;
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}

