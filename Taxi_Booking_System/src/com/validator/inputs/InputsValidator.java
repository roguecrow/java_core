package com.validator.inputs;

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

}
