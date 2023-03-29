package com.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		//BankAccount b = new BankAccount();
		SavingAccount s=new SavingAccount();
		
		System.out.println("---------Bank Details---------");
		System.out.println("Enter name: ");
		String name=sc.next();
		s.setName(name);
		System.out.println("Enter Account number: ");
		int accno=sc.nextInt();
		s.setAccNumber(accno);
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		s.setBalance(balance);
		System.out.println("Enter pin");
		int pin_u=sc.nextInt();
		
		
		int choice;
		System.out.println("-------Welcome To SBI-------");
		if(pin==pin_u) {
		do {
				System.out.println("Our Bank Include Following Facility:");
				System.out.println("1.withdraw\n"
						+ "2. deposite\n"
						+ "3. Interest\n"
						+ "4. Show Details\n"
						+ "5. Exit");
				System.out.println("Please enter Your Choice: ");
				choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter amount: ");
				float amount = sc.nextFloat();
				System.out.println("you withdraw "+amount+" successfully");
				System.out.println("Your current Balance is: "+s.withdraw(amount));
				break;
				
			case 2:
				System.out.println("Enter amount: ");
				double amount1 = sc.nextDouble();
				System.out.println("You successfully deposit "+amount1);
				System.out.println("Your current Balance is: "+s.deposite(amount1));
				break;
				
			case 3:
				System.out.println("You got the interest "+s.toString());
				break;
				
			case 4:
				System.out.println("-----Account Details------");
				System.out.println(s.toString());
				break;
			case 5:
				System.exit(0);
				
			}
			System.out.println("You want to perform more operation yes-1/no-2");
			choice=sc.nextInt();
		}while(choice==1);
			
		}else 
			{
			System.out.println("You enter wrong pin");
			//System.out.println("Do you want to reenter pin yes-1/No-2");
			//choice=sc.nextInt();
			}
	}

}
