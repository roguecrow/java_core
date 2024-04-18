package com.operator.viewer;

import java.util.Scanner;

public class Main {

//	 static int[] scannerFun(Scanner scanner,int numInputs) {
//		int[] inputs = new int[numInputs];
//		for(int i =0; i< numInputs; i++) {
//			System.out.println("Enter input " + (i+1) + ":");
//			inputs[i] = scanner.nextInt();
//		}
//		return inputs;
//	}
	
	public static void main(String[] args) {
		String userdec;
		// TODO Auto-generated method stub
		System.out.println("1.Arithmetic Operators"
				+ "\n2.Unary Operators\n3.Assignment Operators\n"
				+ "4.relational Operators\n5.Logical Operators\n"
				+ "6.Ternary Operators\n7.Bitwise Operators");
		System.out.println("Choose a option");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		  case 1:
		    System.out.println("Arithmetic Operations");
		    System.out.println("Enter number 1 & number 2");
		    ArthematicOp operation1 = new ArthematicOp();
		    operation1.arthematicOpViewer(sc.nextInt(),sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    break;
		    
		  case 2:
		    System.out.println("Unary Operators");
		    System.out.println("Enter number 1 & number 2");
		    UnaryOp operation2 = new UnaryOp();
		    operation2.unaryOpViewer(sc.nextInt(),sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    break;
		  case 3:
		    System.out.println("Assignment Operators");
		    System.out.println("Enter the number");
		    AssignmentOp operation3 = new AssignmentOp();
		    operation3.assignmentOpViewer(sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    break;
		  case 4:
		    System.out.println("relational Operators");
		    System.out.println("Enter number 1 , number 2, number 3 : ");
		    RelationalOp operation4 = new RelationalOp();
		    operation4.relationalOpViewer(sc.nextInt(),sc.nextInt(),sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    break;
		  case 5:
		    System.out.println("Logical Operators");
		    LogicalOp operation5 = new LogicalOp();
		    operation5.logicalOpViewer();
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    break;
		  case 6:
		    System.out.println("Ternary Operators");
		    System.out.println("Enter number 1 , number 2, number 3 : ");
		    TernaryOp operation6 = new TernaryOp();
		    operation6.ternaryOpViewer(sc.nextInt(),sc.nextInt(),sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    	break;
		  case 7:
		    System.out.println("Bitwise Operators");
		    System.out.println("Enter number 1 , number 2 : ");
		    BitwiseOp operation7 = new BitwiseOp();
		    operation7.bitwiseOpViewer(sc.nextInt(),sc.nextInt());
		    System.out.println("What to return to main Menu : yes or no");
		     userdec = sc.next();
		    if(userdec.equals("yes") || userdec.equals("Yes")) {
		    	main(null);
		    }
		    else {
		    	break;
		    }
		}		
		
	}
}
