package com.april8.task1;

import java.util.Scanner;

public class PFinder {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("enter");
	    String word = sc.next();
	   String firstWord = word.substring(0, word.length()/2);
	   String lastWord = word.substring(word.length()/2-1, word.length()/2+1);
	   System.out.println(firstWord);
	   System.out.println(lastWord);
	    
	    System.out.println(paliendromFinder(word));
	}
	
	static boolean paliendromFinder (String word) {
		String upWord = word.toUpperCase();
		System.out.println(upWord);
	    char[] sWord = upWord.toCharArray();
	    for(int i = 0,j = sWord.length -1;i < j;) {
	    	if(sWord[i] >= 65 && sWord[i]<=90 || sWord[j] >=65 && sWord[j]<=90) {
	    		if(sWord[i] != sWord[j]) {
	    			return false;
	    		}
	    		else {
	    			return true;
	    		}
	    	}
	    }
		return false;
	}
}
