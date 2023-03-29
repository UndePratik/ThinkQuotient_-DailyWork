package com.array;

public class ProductOfNo {

	static void product(int ar[]) {
		int product = 1;
		for(int i=1; i<ar.length; i++)
		{
		if(ar[i]%2==0)
		{
			product*=ar[i];
			
			}
		
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		int arr[]= {4,5,3,6,8,9,7,2};
		
		product(arr);
	}

}
