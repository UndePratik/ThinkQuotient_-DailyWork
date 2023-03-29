package com.bank;

public class BankAccount {
	
		private String name;
		private int accNumber;
		private double balance;
		
		
		public BankAccount() {
			super();
		
		}


		public BankAccount(String name, int accNumber,double balance) {
			super();
			this.name = name;
			this.accNumber = accNumber;
			this.balance = balance;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAccNumber() {
			return accNumber;
		}


		public void setAccNumber(int accNumber) {
			this.accNumber = accNumber;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}
	
		public double deposite(double amount)
		{
			balance = balance+amount;
			return balance;
		}
		
		public double withdraw(float amount)
		{
			if(balance<amount) 
				System.out.println("You have insufficient balance");
			else 
				balance = balance-amount;
				return balance;	
		}
		
			
	}

