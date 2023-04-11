package com.Assignment_2;
//7. WAP to print Fibonacci series up to 20 terms.
public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 20;
		int a =0;
		int b =1;
		int sum = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=a; i<=num; i++) {
			sum = a+ b;
			a=b;
			b=sum;
			
			System.out.print(sum+" ");
		}

	}

}
