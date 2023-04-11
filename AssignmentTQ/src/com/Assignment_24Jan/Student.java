package com.Assignment_24Jan;

public class Student {
	private int roll_no;
	int admission_no;
	protected int age;
	public String course_id;
	
	private int doPrivate()
	{
		
		return 101;
	}
	public void doPublic()
	{
		System.out.println("MCA");
	}
	void doDefault()
	{
		System.out.println("123");
	}
	protected int doProtected()
	{
		return 23;
	}
	

}
