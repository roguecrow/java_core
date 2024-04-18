package com.hacker.code;

import java.util.Random;
import java.util.regex.Matcher;

public class randomUserGenerator {
	
    static String userNameGenerator(int n,String pattern) {
        Random random = new Random();
        StringBuilder strBuilder = new StringBuilder();

        while(strBuilder.length() < n)
        {
            char userName = (char)(random.nextInt(35,120)) ;
            if(Character.toString(userName).matches(pattern)) {
                strBuilder.append(userName);
            }
        }
        return strBuilder.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String pattern = "^[a-zA-Z0-9]+$";
        String midPattern = "[@]";
        String endPattern = "^[a-z]+$";
        System.out.println(userNameGenerator(8,pattern) + (userNameGenerator(1,midPattern))+(userNameGenerator(4,endPattern)+".com")); 
	}
}

