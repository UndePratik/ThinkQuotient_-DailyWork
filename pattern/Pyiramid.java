package pattern;

import java.util.Scanner;

public class Pyiramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		/*for(int i=1; i<=n; i++) {
			
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//1st Half
			for(int j=i; j>=1; j--) {
			
				System.out.print("*");
		}
		//Second Half
		for(int j=2; j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
	  }*/
		for(int i=1; i<=5; i++) {
			for(int sp=4; sp>=i; sp--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int sp=4; sp>=i; sp--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
