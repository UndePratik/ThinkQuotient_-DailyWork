package Constructor;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Customer c1 = new Customer();
		Customer c2 = new Customer(101,"Rohit","9598314713");
		Customer c3 = new Customer(102,"Shivam","Dell Laptop",55000.0f,"9865472365","FullPaid");
		
		System.out.println("-----------------------");
		System.out.println("Enter id : ");
		c1.setC_id(sc.nextInt());
		
		System.out.println("Enter name :");
		c1.setC_name(sc.next());
		
		System.out.println("Enter Phone Number :");
		c1.setPhone_number(sc.next());
		
		System.out.println("Do you want to purchase item(1-yes/0/no):");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter the item name :");
			c1.setItem_name(sc.next());
			
			System.out.println("Enter Price :");
			c1.setItem_price(sc.nextFloat());
			
			System.out.println("Enter payment Status : ");
			c1.setStatus(sc.next());
		}else
			System.exit(0);
		System.out.println(c1);
		System.out.println("-----------------");
		System.out.println(c2);
		System.out.println("-----------------");
		System.out.println(c3);
	}

}
