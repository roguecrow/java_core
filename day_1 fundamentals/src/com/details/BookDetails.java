package com.details;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int year;
		String genre;
		int rating;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the book name :");
		name = sc.nextLine();
		// TODO Auto-generated method stub
		System.out.println("Enter year of publish :");
		year = sc.nextInt();
		System.out.println("Enter genre :");
		genre = sc.next();
		System.out.println("Enter  book rating :");
		rating = sc.nextInt();	
		
		System.out.println("Book NAME :1" +name + "\nyear :" +year + "\ngenre :" + genre + "\nrating :" + rating);


	}

}
