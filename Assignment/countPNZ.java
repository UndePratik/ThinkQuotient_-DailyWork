package Exercise;

import java.util.Scanner;

public class countPNZ {

	public static void main(String[] args) {
		int positive = 0, negative = 0, zero = 0;
		
		System.out.println("Press 1 to Continue and 0 to Stop ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input == 1) {
			System.out.println("Enter your number : ");
			int number = sc.nextInt();
			if(number > 0) {
				positive++;
			}else if(number < 0){
				negative++;
			}else {
				zero++;
			}
			System.out.println("Press 1 to Continue and 0 to Stop ");
			input = sc.nextInt();
		}
			System.out.println("Press 1 to Continue and 0 to Stop "+positive);
			
			System.out.println("Press 1 to Continue and 0 to Stop "+negative);
			
			System.out.println("Press 1 to Continue and 0 to Stop "+zero);
			
			

	}

}
