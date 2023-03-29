package loop;

import java.util.Scanner;

public class ProductofDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number...");
		int num = sc.nextInt();
		int product = 1;
		
		while(num != 0) {
			int rem = num%10;
			product *= rem;
			
			num = num/10;
		}
		System.out.println(product);

	}
	

}
