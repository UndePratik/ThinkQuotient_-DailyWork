package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayList {

	public static void main(String[] args) {

		ArrayList<String> stud = new ArrayList();
		stud.add("Rohit");
		stud.add("Pratik");
		stud.add("Shivam");
		stud.add("datta");
	
		System.out.println(stud);

		System.out.println("Normal for loop:-------------------");
		for(int i=0; i<stud.size(); i++)
		{
			System.out.println(stud.get(i));
		}

		System.out.println("Enhanched for loop:-------------");
		for(String s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println("Iterator:-------------------");
		Iterator<String> itr = stud.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("ListItorator(forward):-------------------");
		Iterator<String> itr1 = stud.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
