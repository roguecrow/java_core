package com.hacker.code;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;


class Finder {
	
    void checkPrime(int... numbers){
        for(int num : numbers){
            if(isPrime(num)){
                System.out.print(num+" ");
            }
        }
        System.out.println();
         
    }
    static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        else{
            for(int i = 2;i<=Math.sqrt(num); i++){
                if(num % i== 0){
                    return false;
                }
               
            }
        }
         return true;
    }
}

public class PrimeFinder {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Finder ob=new Finder();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Finder.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
