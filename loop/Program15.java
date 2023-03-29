package loop;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n = sc.nextInt();
		int s = 1;
		for(int i=1; i<=n; i++) {
			s *= i;
		}
		System.out.println("The value of s is "+s);
	}

}
