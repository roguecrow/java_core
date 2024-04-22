package com.emp.details;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InputsValidator {
	
	public boolean intInputChecker(int number) {
		if(number <0) {
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean stringInputChecker(String word) {
		String wordMatcher = "^[a-zA-Z_]+$";
		if(!word.matches(wordMatcher)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean mailInputChecker(String word) {
		String wordMatcher = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$";
		if(!word.matches(wordMatcher)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean longNumberInputChecker(String word) {
		String wordMatcher = "^[0-9]{10,15}$";
		if(!word.matches(wordMatcher)) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean IfscCodeInputChecker(String word) {
		String wordMatcher = "^[A-Z]{4}0[A-Z0-9]{6}$";
		if(!word.matches(wordMatcher)) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean dateInputChecker(String word) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    try {
	        sdf.parse(word);
	        return true; 
	    } catch (ParseException e) {
	        return false;
	    }
	}
	

}