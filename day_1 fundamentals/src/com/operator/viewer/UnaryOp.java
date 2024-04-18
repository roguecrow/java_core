package com.operator.viewer;

import java.util.Scanner;

public class UnaryOp {
	
	void unaryOpViewer(int a ,int b) {

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
	}

}
