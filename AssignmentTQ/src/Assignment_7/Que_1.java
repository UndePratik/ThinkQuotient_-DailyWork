package Assignment_7;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		
		System.out.println("Enter array elements");
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		for(String a:arr)
		{
			System.out.println(a);
		}
		}

}
