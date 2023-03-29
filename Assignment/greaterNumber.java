package Exercise;

import java.util.Scanner;

public class greaterNumber {
	
	public static int greaterNumber(int a, int b) {
		if(a>b) {
			//System.out.println(a+" is the greater number");
			return a;
		}else {
			//System.out.println(b+" is greater Number");
			return b;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//greaterNumber(a,b);
		System.out.println(greaterNumber(a,b)+" is a greater number");
	}

}
