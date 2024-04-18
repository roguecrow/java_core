package com.april10.task2;

import java.util.Scanner;

import com.validator.inputs.InputsValidator;

public class GameScoreBoard {

	static void displayHighScorePosition(String playerName,int position) {
		System.out.println(playerName + " managed to get into " + position + "position on the high score table.");
	}
	
	static int calculateHighScorePosition(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		}
		else if(playerScore >= 500 && playerScore < 1000) {
			return 2;
		}
		else if(playerScore >= 100 && playerScore < 500) {
			return 3;
		}
		else {
			return 4;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playerName;
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player name :");
		playerName = sc.nextLine();
		System.out.println("Enter Score:");
		score = sc.nextInt();
		InputsValidator validate = new InputsValidator();
		if(validate.intInputChecker(score) || validate.stringInputChecker(playerName)) {
			displayHighScorePosition(playerName,calculateHighScorePosition(score));
		}
		else {
			System.out.println("Enter a valid input");
			main(null);
		}
	}

}
