package loop;

import java.util.Scanner;

public class DisplayQuantity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int m_quantity =sc.nextInt();
			int o_quantity = sc.nextInt();
			
			sum= m_quantity*40+o_quantity*50;
			
			if(sum>500) {
				break;
			}
		}
		System.out.println(sum);
	}

}
