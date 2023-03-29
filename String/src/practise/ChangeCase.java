package practise;

import java.util.Scanner;

public class ChangeCase {
	
public static void changeCase(String arr)

	{
			
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String arr = sc.next().toUpperCase();
		
		changeCase(arr);
	}

}
