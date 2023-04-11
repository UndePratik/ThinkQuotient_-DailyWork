package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		
		ArrayList<String> stud = new ArrayList();
		stud.add("Rohit");
		stud.add("Pratik");
		stud.add("Shivam");
		stud.add("datta");
		stud.add("Pratik");
		
		
		System.out.println(stud);
		
		for(int i=0; i<stud.size();i++)
		{
			if(stud.get(i)==("Pratik"))
			{
				stud.remove(i);
			}
		}
		System.out.println("-------------After Rmoving-----------");
		System.out.println(stud);
		
	}
}
