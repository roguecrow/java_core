package com.april8.task1;

import java.util.Scanner;

public class PatternE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Char :");
		char word = sc.next().charAt(0);
		char charA = 'A';
		int counter = 4;
		if((word - charA) % 2 != 0) {
			counter = 5;
		}
		int row = word - charA + counter;
		int charRow = word - charA+1; 
		System.out.println(charRow);
		for(int i =0;i<row;i++) {
			if(i>=(charRow-1)) {
				if(i%2==0) {
					for(int k = 0;k<=i;k++) {
							System.out.print((char)(charA+k));
				}
				System.out.println();
				}
				else {
					for(int l =1;l<=i+1;l++) {
						System.out.print(l);
					}
					System.out.println();
				}
			}
		}
	}

}
