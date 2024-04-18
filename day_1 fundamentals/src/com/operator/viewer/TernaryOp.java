package com.operator.viewer;

public class TernaryOp {
	
	void ternaryOpViewer(int a,int b,int c) {
		int result;

	        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	        System.out.println("Max of three numbers = "+ result);
	}
}
