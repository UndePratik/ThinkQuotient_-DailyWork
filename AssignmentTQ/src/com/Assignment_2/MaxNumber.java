package com.Assignment_2;

import java.util.Scanner;

//1. Write a java program to find maximum number from given 3 numbers.
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Number :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("--------------");
		
		if(num1>num2) {
			if(num1>num3) 
				System.out.println("The Maximum Number is :"+num1);
			else
				System.out.println("The Maximum Number is :"+num3);
			
			
		}else
			if(num2>num3)
			System.out.println("The Maximum Number is :"+num2);
			else
				System.out.println("The Maximum Number is :"+num3);
	}

}
