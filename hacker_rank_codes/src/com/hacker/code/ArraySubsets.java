package com.hacker.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySubsets {
	
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
       int n = nums.length;
       int pow = (int)Math.pow(2, n);

       for(int i = 0; i < pow; i++){
           List<Integer> arrl = new ArrayList<>();

           for(int j = 0; j < n; j++){

               if( ( i & (1 << j )) == 0 ){ 
                   arrl.add(nums[j]);
               }

           }
           list.add(arrl);
       }
       return list;
   }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter array length :");
		int length = sc.nextInt();
		System.out.println("enter the array");
		int[] arr = new int[length];
		for(int i = 0;i<length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(subsets(arr));
	}

}
