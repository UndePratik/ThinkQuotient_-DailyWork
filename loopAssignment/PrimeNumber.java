package com.loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num=sc.nextInt();
		
		boolean flag=true;
		if(num==0 || num==1)
			System.out.println(num+" is not prime number");
		else
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					flag=false;
					break;
				}
			}
		if(flag)
		{
			System.out.println(num+" is a prime number");
		}
		
		sc.close();
	}

}
