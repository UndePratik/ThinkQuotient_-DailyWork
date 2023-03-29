package loop;

import java.util.Scanner;

public class EvenNo1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the number...");
		int n = sc.nextInt();
		int sum = 0;
		
		for(i=1; i<=n; i++) {
			if(i%2 == 0) {
				sum =sum + i;
			}	
		}
		System.out.println("The sum of even number is...");
		System.out.println(sum);

	}

}
