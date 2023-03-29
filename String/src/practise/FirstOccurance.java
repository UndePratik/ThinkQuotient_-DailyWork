package practise;

import java.util.Scanner;

//Write a Java program to find first occurrence of a character in a given string.
public class FirstOccurance {
	
	public static void firstOccurance(String s)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a character: ");
	       char ch = sc.next().charAt(0);

	        int index = s.indexOf(ch);

	        if (index == -1) {
	            System.out.println("not found: "+ch);
	        } else {
	            System.out.println(ch + " " + index);
	        }
		
	}

	public static void main(String[] args) {
		//String s = "HelloWorld";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		
		firstOccurance(s1);
	}
}
