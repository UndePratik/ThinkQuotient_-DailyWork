package loop;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity of milk...");
		float milk = sc.nextFloat();
		System.out.println("Enter quantity of oil...");
		float oil = sc.nextFloat();
		float quantity = milk+oil;
		
		int m_price = 40;
		int o_price = 50;
		
		float total_m = milk*m_price;
		float total_o = oil*o_price;
		
		float total = total_m + total_o;
		if(total >= 500) {
			float quantity_m = milk/quantity*100;
			float quantity_o = oil/quantity*100;
			System.out.println(quantity_m+" is a quantity of milk");
			System.out.println(quantity_o+" is a quantity of oil");
			
		}else {
			System.out.println("Please Enter more Quantity of milk and oil");
		}
sc.close();
	}

}
