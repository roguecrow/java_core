package com.details;

import java.util.Scanner;

public class MovieDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int year;
		String genre;
		double rating;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name :");
		name = sc.nextLine();
		// TODO Auto-generated method stub
		System.out.println("Enter year :");
		year = sc.nextInt();
		System.out.println("Enter genre :");
		genre = sc.nextLine();
		System.out.println("Enter rating :");
		rating = sc.nextDouble();	
		
		System.out.println("NAME :" +name + "\nyear :" +year + "\ngenre :" + genre + "\nrating :" + rating);

	}

}
