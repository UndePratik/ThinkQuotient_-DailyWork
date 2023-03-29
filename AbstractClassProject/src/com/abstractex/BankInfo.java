package com.abstractex;

public class BankInfo extends Bank {
	void setIntrest() {
		intrest += 12;
	}
	
	void display() {
		System.out.println("Bankinfo : "+name+" "+intrest);
	}

	public static void main(String[] args) {
		BankInfo b1 = new BankInfo();
		b1.display();

	}

}
