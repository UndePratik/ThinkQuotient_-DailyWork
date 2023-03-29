package pattern;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		char ch;
		for(int i=1; i<=n; i++) {
			ch='A';
			for(int sp=1; sp<=n-i; sp++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(ch);
				ch++;
				}
			System.out.println();
			}
			
		}

	}


