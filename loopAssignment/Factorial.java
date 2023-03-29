package com.loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		long fact =1;
		
		for(int i=1; i<=num; i++) {
			fact = i*fact;
			System.out.println(fact+" * "+i+" = "+fact);
		}
		System.out.println("-------------------");
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
