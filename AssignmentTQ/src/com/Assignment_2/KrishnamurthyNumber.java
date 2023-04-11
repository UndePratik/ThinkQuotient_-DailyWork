package com.Assignment_2;

import java.util.Scanner;

/*8. WAP to check no is Krishnamurthy or not (Using while loop)
i.e. 153 = 1! + 5! + 3! = 153*/
public class KrishnamurthyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int fact=1;
		int temp=num;
		int sum = 0;
		
		while(num != 0)
		{
			int rem = num%10;
			
			for(int i=1; i<=rem; i++)
			{
				fact = fact*i;
				
			}
			sum+=fact;
			num/=10;
		}
		if(temp==sum)
			System.out.println(temp+" is Krishnamurthy Number ");
		else
			System.out.println(temp+" is not Krishnamurthy Number ");
		sc.close();
	}

}
