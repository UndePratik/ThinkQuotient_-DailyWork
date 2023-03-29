package com.loop;

import java.util.Scanner;

public class SumOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n = sc.nextInt();
		int sumOdd=0;
		int sumEven = 0;
		
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) //Odd
				sumOdd+=i;
			else
				sumEven+=i;//even
			
		}
		System.out.println("The sum of odd number is :"+sumOdd);
		System.out.println("The sum of odd number is :"+sumEven);
	}

}
