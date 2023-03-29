package com.array;

import java.util.Scanner;

public class Maxnum {
	
	static String max;
	
	static void maxNum(int ar[]) {
		
		int max=ar[0];
		for(int x:ar)
		{
		
			if(max<x)
			{
				max=x;
			}
		}
		System.out.println("Maximum number :"+max);
	}
	static void minNum(int ar[]) {
		int mini=ar[0];
		for(int x:ar)
		{
		
			if(mini>x)
			{
				mini=x;
			}
		}
		System.out.println("minimum number :"+mini);
	}

	public static void main(String[] args) {
		//int arr[]= {5,6,7,98,2,3,4};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		maxNum(arr);
		minNum(arr);
	}

}
