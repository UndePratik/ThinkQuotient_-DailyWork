package com.interface1;

public class ShoppingMall implements Payment {
	
	int sid;
	String sname;
	float bill;
	
	
	public ShoppingMall(int sid, String sname, float bill) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.bill = bill;
	}

	public void pay(double amount)
	{
		amount = amount - (0.01*amount);
		System.out.println("Total bill : "+amount);
	}
	
	public static void main(String[] args) {
		ShoppingMall s1 = new ShoppingMall(1,"Pratik",15200);
		s1.pay(1200);
	}
}
