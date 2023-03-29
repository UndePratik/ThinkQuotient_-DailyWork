package practise;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[100];
		int i;
		System.out.println("Enter String: ");
		for(i=0; i<str.length; i++)
		{
			str[i]=sc.nextLine();
		}
		
		
		System.out.println(str[i]);
	}

}
