package assignment31_Dec;

//import java.util.Scanner;

public class Account {
	String a_name;
	double a_number;
	float amount;
	
	

	void insert(String n, double no, float amt) {
	
		this.a_name = n;
		this.a_number =no;
		this.amount = amt;
	}
	
	void display() {
		System.out.println("Account holder name is : "+a_name);
		System.out.println("Account number is      : "+a_number);
		System.out.println("Account balance is     : "+amount);
		
	}
	
	void deposit(float amt) {
		amount =amount+amt; 
		System.out.println(amt+" is successfully deposited to your account");
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient balance in your accont");
		}else
			amount=amount-amt;
			System.out.println(amt+" is successfully withdraw");
	}
	void check_balance() {
		System.out.println(amount+" is available balance");
	}



	public static void main(String[] args) {
		Account a = new Account();
		a.insert("Pratik",132456789,1000);
		a.display();
		System.out.println("-----------------------");
		a.deposit(50000);
		System.out.println("-----------------------");
		a.check_balance();
		
		/*Scanner sc = new Scanner(System.in);
		Account a = new Account();
		
		System.out.println("Please enter your name...");
		String a_name = sc.next();
		System.out.println("Enter your account number...");
		double a_number = sc.nextDouble();
		float amount = 1000;
		*/
		
	}

}
