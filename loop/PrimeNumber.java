package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
       for(int i=2; i<a; i++) {
    	   if(a%i == 0) {
    		   flag = 1;
    	   }
       }
       if(flag == 0) {
    	   System.out.println(a+" is prime");
       }
       else
    	   System.out.println(a+" not prime");
       
       sc.close();
	}

}
