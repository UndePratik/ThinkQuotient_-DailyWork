package com.loop;

import java.util.Scanner;

public class AlternatePrimeN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=1;
		int num=2;
		boolean tr=true;
		while(count<=n)
			//while(count<=2*n)
		{
			boolean flag=true;
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				tr=!tr;
				if(tr) {
					System.out.println(num);
					count++;
				}
				/*count++;
				if(count%2==0) {
					System.out.println(num);
				}*/
			}
			num++;
		}

	}

}
