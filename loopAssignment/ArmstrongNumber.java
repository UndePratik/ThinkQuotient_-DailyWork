package com.loop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*int num = 153;
		int temp = num;
		double rem,rev=0;
		
		while(num != 0)
		{
			rem =num%10;
			rev += Math.pow(rem, 3);
			num = num/10;
			
		}
		*/
		int temp = num;
		int armNumber = 0;
		int digits = 0;
		
		while(num != 0) {
			num/=10;
			digits++;
			
		}
		
		if(armNumber==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");
	}
	
}
