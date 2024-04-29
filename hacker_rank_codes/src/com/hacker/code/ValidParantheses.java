package com.hacker.code;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {	
	
	static boolean  paraChecker(String str ,String[] arr1) {
		boolean flag = false;
		Stack<String> stk= new Stack<>();  
		if(str.length()%2 == 0) {
			System.out.println(str.length());
			for (int i = 0; i < str.length(); i += 2) {
				System.out.println(i+"-" +(i+2));
			    stk.push(str.substring(i, i + 2));
			    }
			for(int i =0; i<stk.size();i++) {
				System.out.println(stk.peek());
				if(stk.contains(arr1[i])) {					
					flag = true;
				}
				else {
					flag = false;
				}
			}
		}
		else {
			System.out.println(str.length());

			flag = false;
		}
		 System.out.println("Elements in Stack: " + stk); 
		return flag;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str ;
		String[] arr1 = {"()","[]","{}"};
		System.out.println("enter value :");
		str = sc.nextLine();
	     System.out.println(paraChecker(str,arr1));

	}

}
