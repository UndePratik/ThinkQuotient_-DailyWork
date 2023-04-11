package com.Assignment_2;
//2. Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		
		int rem;
		int count=0;
		
		while(num != 0)
		{
			rem =num%10;
			count=count+rem;
			num/=10;
		}
		System.out.println("------------");
		System.out.println("Sum of Digit is :"+count);
	}

}
