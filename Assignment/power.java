package Exercise;

import java.util.Scanner;

public class power {
	
	public static int squareOfX(int x, int n) {
		int square = x*n;
		return square;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(squareOfX(x,n));

	}

}
