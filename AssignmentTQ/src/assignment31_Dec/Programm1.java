package assignment31_Dec;

import java.util.Scanner;

public class Programm1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the country name : ");
		String CountryName = sc.next();
		
		switch(CountryName) {
		
		case "India":
			System.out.println("National game of India is Hockey");
			break;
			
		case "China":
			System.out.println("National game of China is Tennis");
			break;
			
		case "Bangladesh":
			System.out.println("National game of Bangladesh is Kabaddi");
			break;
			
		case "Italy":
			System.out.println("National game of Italy is Football");
			break;
			
		case "United States":
			System.out.println("National game of United States is Baseball");
			break;
		default:
			System.out.println(CountryName+" Data is not avilable");
		}
	}

}
