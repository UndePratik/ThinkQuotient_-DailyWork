package com.dimond;

public interface Student {

	default void display()
	{
		System.out.println("I am Student");
	}
}
