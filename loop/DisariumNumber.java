package loop;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;
        while(temp>0) {
        	int rem = num%10;
        	count++;
        	temp= temp/10;
        }
        int disanum = num;
        while(num>0) 
        {
        	int x= 1;
        	
        	int rem = num%10;
        	
        	for(int i=1;i<=count;i++) 
        	{
        		x=rem*x;
        	}
        	//System.out.println(x);
        	sum+=x;
        	
        	num/=10;
        	count--;
        }
        if(disanum == sum) {
        	System.out.println("d");
        }else
        	System.out.println("n d");
	}
	

}

