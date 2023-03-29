package com.array;

import java.util.Scanner;


public class AlternateNumber {
	
	static void alternateNumber(int ar[]) {
		
		for(int i=0; i<ar.length; i++)
		{
		if(i%2!=0)
			System.out.println(ar[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of array :");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		alternateNumber(arr);
	}

}
