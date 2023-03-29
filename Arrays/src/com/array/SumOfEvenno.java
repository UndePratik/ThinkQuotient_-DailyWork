package com.array;

public class SumOfEvenno {

	public static void main(String[] args) {
		int arr[]= {4,5,3,6,8,9,7,2};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			//System.out.println(arr[i]);
		
		if(arr[i]%2==0)
		{
			sum+=arr[i];
			
			}
		
		}
		System.out.println(sum);
	}
}
