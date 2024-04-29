package com.java.using.colections;
import java.util.ArrayList;
import java.util.Scanner;

public class SampleArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> sList = new ArrayList<String>();
        
        while (true) {
            System.out.println("1.Add a Name");
            System.out.println("2.Display the Names");
            System.out.println("3.Search for the Name");
            System.out.println("4.Delete the Name");
            System.out.println("5.Exit");

            System.out.println("Enter a value:");
            int num = input.nextInt();
            switch (num) {
            case 1:

                System.out.println("Enter the Name");
                sList.add(input.next());
                break;

            case 2:
                if(sList.isEmpty()) {
                    System.out.println("No names added!");
                }
                else {
                    System.out.println("Students Name:");
                    for (String i : sList) {
                        
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                System.out.println("Enter a name to search:");
                String name=input.next();
                if(sList.contains(name)) {
                    System.out.println(name+" is found");
                }
                else {
                    System.out.println(name+" is not found");
                }
                break;
            case 4:
                System.out.println("Enter the name to delete:");
                String name1=input.next();
                if(sList.contains(name1)) {
                    System.out.println(sList.remove(name1));
                }
                break;
            case 5:
                System.out.println("application ended");
                System.exit(0);

            }
        }

    }

}
