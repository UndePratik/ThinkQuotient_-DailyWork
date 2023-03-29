package loop;

import java.util.Scanner;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number...");
		int num = sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int fact =1;
			int rem = num%10;
		
		for(int i=1; i<= rem; i++) {
			fact = fact * i;
		}
		sum =sum+fact;
		num = num/10;
		}
		if(temp == sum) {
			System.out.println("The number is Krishnamurthy Number ");
		}else 
			System.out.println("The number is not Krishnamurthy Number ");
	}

}
