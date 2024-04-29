package com.hacker.code;

import java.util.Scanner;

public class SubSequence {
	
    public static boolean isSubsequence(String s, String t) {
    	int i=0,j=0;
        int n = s.length();
        int m = t.length();
        while(i<n && j<m){
            if(s.charAt(i) == t.charAt(j)){
                i++;j++;
            }else{
                j++;
            }
        }

        if(i==n) return true;
        return false;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isSubsequence(sc.next(),sc.next()));
		// TODO Auto-generated method stub

	}

}
