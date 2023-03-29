package com.array;

public class Arrayprime {

	public static void isPrime(int n) {
		int flag =0;
	   
	    
	    for (int i = 2; i <= n/2; i++) {
	        if (n % i == 0) {
	           flag = 1;
	           break;
	        }
	       
	    }
	    if(flag == 0) {
	    	
	    	System.out.println(n+" is prime");
	    }
	   
	}

	public static void main(String[] args) {
	    int[] a = {1, 2, 4, 5, 8, 3};
	    for (int i = 0; i < a.length; i++) {
	    	if(a[i] ==1)
	    		continue;
	        isPrime(a[i]);
	           
	        }
	    }
	}