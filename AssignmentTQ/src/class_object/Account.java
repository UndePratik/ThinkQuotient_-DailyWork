package class_object;

import java.util.Scanner;

public class Account {
	String a_name;
	int a_no;
	float a_balance=1000;
	
	void insert(String n, int no, float amt) {
		
		this.a_name = n;
		this.a_no =no;
		this.a_balance = amt;
	}
	
	void display(String a_name,int a_no){
		System.out.println("Customer Name      : "+a_name);
		System.out.println("Account Number     : "+a_no);
		System.out.println("Account Balance is :"+a_balance);
		
	}
	void deposit(float price) {
		a_balance = a_balance+price;
		System.out.println("You successfully deposite "+price+" Rs");
		
	}
	void withdraw(float price) {
		if(a_balance>price) {
			a_balance = a_balance-price;
			System.out.println("You Successfully withdraw "+price+" Rs");
		}else
			System.out.println("Insufficient Balance");
	}
	void check_balance() {
		System.out.println("Your Account Balance is "+a_balance+" Rs");
	}
	

	public static void main(String[] args) {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String a_name = sc.next();
		System.out.println("Enter Your Account Number : ");
		int a_no = sc.nextInt();
		int choice;
		do {
			System.out.println("***Welcome to SBI***");
			
			System.out.println("1. display");
			System.out.println("2. deposit");
			System.out.println("3. withdraw");
			System.out.println("4. check balance");
			System.out.println("5. Exit");
			
			System.out.println("Please Enter number : ");
		
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
			{
				a.display(a_name,a_no);
				break;
			}
			case 2:
			{
				System.out.println("Please enter amount : ");
				float price = sc.nextInt();
				a.deposit(price);
				break;
			}
			case 3:
			{
				System.out.println("Please enter amount : ");
				float price1 = sc.nextInt();
				a.withdraw(price1);
				break;
			}
			case 4:
			{
				a.check_balance();
				break;
			}
			case 5:
			{
				System.exit(5);
			}
			
			}
			System.out.println("----Thank you "+a_name+" ----");
		}while(choice != 5);
		

	}

}