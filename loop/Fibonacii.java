package loop;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=a; i<=n; i++) {
			sum = a+b;
			a=b;
			b=sum;
			
			System.out.print(sum+" ");
		}

	}

}
