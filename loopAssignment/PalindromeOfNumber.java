package com.loop;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int temp = num;
		int rem,rev=0;
		while(num != 0) {
			rem =num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}
		if(temp==rev) {
			System.out.println(temp+" is palindrome number");
		}else
			System.out.println(temp+" is not palindrome number");

	}

}
