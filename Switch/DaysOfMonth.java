package com.Switch;

import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month No :");
		int month = sc.nextInt();
		if(month>0 && month<=12) {
			
		switch(month) {
		
		case 1:
			System.out.println("Jan as 31 days");
			break;
		case 2:
			System.out.println("Enter Year :");
			int year = sc.nextInt();
			 boolean x = (year % 4 == 0);
	         boolean y = (year % 100 != 0);
	         boolean z = ((year % 100 == 0) && (year % 400 == 0));
	         
			if(x && (y || z)) {
				System.out.println("Feb as 28 days");
			}else
				System.out.println("Feb as 29 days");
			break;
			
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
				System.out.println("Month as 31 days");
				break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("Month as 30 days");
			break;
		}
	}else
		System.out.println("You Enter wrong month no!!!");
	}

}
