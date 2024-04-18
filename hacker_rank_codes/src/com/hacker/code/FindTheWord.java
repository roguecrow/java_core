package com.hacker.code;

import java.util.Scanner;

public class FindTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("enter sentence");
		str = sc.nextLine();
		System.out.println("Enter the number");
		num = sc.nextInt();
		String [] arr = str.split(" ");
		System.out.println(arr[num-1]);
		}
}
