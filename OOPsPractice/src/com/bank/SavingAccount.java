package com.bank;

public class SavingAccount extends BankAccount {

	private int interestRate;
	
	public SavingAccount() {
		super();
		
	}


	public SavingAccount(String name, int accNumber,double balance,int interestRate)
	{
		super(name, accNumber,balance);
		this.interestRate=interestRate;	
	}
	
	
	public int getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}


	public double calaculateInterest()
	{
		double interest=getBalance()*0.03*365;
		return interest;
	}


	@Override
	public String toString() {
		return "BankAccount Details: \nname: " +getName() +", accNumber: " +getAccNumber() + ", balance: "+ getBalance()+ "\nSavingAccount Details: \ninterestRate: " + interestRate + " You Get interest: "+calaculateInterest();
	}
	
	

}
