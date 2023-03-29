package loop;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number...");
		int base = sc.nextInt();
		System.out.println("Enter the power of number...");
		int index = sc.nextInt();
		int temp = index;
		long square = 1;
		
		while(index != 0) {
			square = square *base;
			--index;
		}
		System.out.println(base+" to the power "+temp+" is "+square);
	}

}
