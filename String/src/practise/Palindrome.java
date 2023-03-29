package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	
	public static void checkPalindrome(String str)
	{
		int rev;
		String newS=""; 
		for(int i=str.length()-1; i>=0; i--)
		{
			newS=newS+str.charAt(i);
		}
		//System.out.println(newS);
		if(str.equals(newS))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter word :");
		String str=sc.next().toLowerCase();
		
		checkPalindrome(str);
	}

}
