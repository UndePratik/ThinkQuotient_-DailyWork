package com.vector;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<String> names = new Vector<>();
		
		System.out.println(names.size());//number of elements
		System.out.println(names.capacity());
		System.out.println("------------------------");
		names.add("Rohit");
		names.add("Pratik");
		names.add("Datta");
		names.add("Rohini");
		
		System.out.println(names.size());//number of elements
		System.out.println(names.capacity());
		System.out.println("----------------------------");
		names.add("Harish");
		System.out.println(names.size());
		System.out.println(names.capacity());
		System.out.println("-------------------------");
		//System.out.println(names.setElementAt("Babu", 2));
		
		
	}

}
