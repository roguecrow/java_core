package com.hacker.code;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the date (format: DD MM YYYY):");
	        String[] input = scanner.nextLine().split(" ");
	        int day = Integer.parseInt(input[0]);
	        int month = Integer.parseInt(input[1]);
	        int year = Integer.parseInt(input[2]);

	        // Create a LocalDate object representing the input date
	        LocalDate date = LocalDate.of(year, month, day);

	        // Get the day of the week
	        DayOfWeek dayOfWeek = date.getDayOfWeek();

	        // Convert dayOfWeek to uppercase string
	        String dayOfWeekString = dayOfWeek.toString().toUpperCase();

	        System.out.println(dayOfWeekString);
	    }

}
