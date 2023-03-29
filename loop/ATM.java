package loop;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin=1234;
		int balance=1000;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter username");
	String username=sc.nextLine();
	System.out.println("Enter pin");
	int u_pin=sc.nextInt();
	System.out.println("*****welcome to SBI ATM******");
	System.out.println("******Welcome*******"+username);
	int choice=0;
	if(pin==u_pin)
	{
		do
		{
		
		
		System.out.println(" 1. Withdraw");
		System.out.println(" 2. Deposit");
		System.out.println(" 3. check Balance");
		System.out.println(" 4. Exit");
		
		System.out.println("enter choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the amount to withdraw");
			int withdraw=sc.nextInt();
			if(withdraw>balance)
			{
				System.out.println("Insufficent balance");
			}
			else
				balance=balance-withdraw;
			System.out.println("you have succesfullywithdraw amount");
			System.out.println("Plz check your balance after withdraw");
			break;
		}
		case 2:
		{
			System.out.println("Enter the amount to deposit");
			int dep=sc.nextInt();
			
			
				balance=balance+dep;
			System.out.println("you have succesfully deposit amount");
			System.out.println("Plz check your balance after deposit");
			break;
		}
		case 3:
		{
			
			System.out.println("balbace is : "+balance);
			
				
			break;
		}
		
		case 4:
		{
			System.exit(0);
		}
		
		}
		}while(choice!=4);//while(true);
	}
	else
		System.out.println("******sorry you enter wrong pin******");
	
	
	
	

	}

}