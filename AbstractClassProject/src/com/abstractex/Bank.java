package com.abstractex;

public abstract class Bank{
	int id;
	String name;
	int intrest;
	
	abstract void setIntrest();
	
	void display() {
		System.out.println(id+ " " +name+" "+intrest);
	}
}
