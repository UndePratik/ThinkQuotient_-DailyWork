package com.loop;

import java.util.Scanner;

public class PrintNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=10;i++) {
			sum += i;
		}
		System.out.println("the sum of natural number is.."+sum);

	}

}
