package com.Assignment_2;

public class PrimeNumber_1to50 {

	public static void main(String[] args) {
		
		int counter = 0;
		boolean tr = false;
		for(int i=3;i<=50;i++) {
			int flag = 0;
		for(int j=2; j<i; j++) {
			if(i%j == 0) {
				flag=1;
				counter++;
			}
		}
		if(flag == 0) {
			//counter++;
			//if(counter%2==0)
			System.out.print(i+" ");
		}
		}

	}

}
