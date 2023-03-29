package loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number..");
		int num = sc.nextInt();
		
		/*while(num>0) {
			int rem = num%10;
			System.out.print(rem);
			num = num/10;*/
		int temp = num;
		int rem = 0;
		int rev = 0;
		
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			
			num = num/10;
			
		}
		/*System.out.println(rev);
		if(temp == rev) {
			System.out.println("It is a pallindrom number");
		}else {
			System.out.println("It is not a pallindrom number");
		}*/
	}

}
