package q7;

import java.util.Scanner;

public class AverageOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int rem,count = 0;
		float sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem = num%10;
			count++;
			sum = sum+rem;
			num= num/10;
		}
		float average = sum/count;
		System.out.println("Average of "+temp+" is: "+average);
	}
}
