package com.dimond;

public interface Teacher {

	default void display()
	{
		System.out.println("I am teacher ");
	}
}
