package com.java.using.colections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
        Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B)); 
        
        Set<Integer> combineSet = new HashSet<Integer>(set1);
        combineSet.addAll(set2);
        System.out.println(combineSet);  
        
        Set<Integer> intersection_data = new HashSet<Integer>(set1);    
        intersection_data.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersection_data); 
        
        Set<Integer> difference_data = new HashSet<Integer>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);    

	}

}
