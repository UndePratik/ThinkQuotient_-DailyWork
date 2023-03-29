package com.loop;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		System.out.println("Enter the number..");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem;
		int rev=0;
		while(num != 0) {
			rem= num%10;
			//rev = rev*10+rem;
			num = num/10;
			System.out.println(rem);
			
		}
		//System.out.println(rev);
	}

}
