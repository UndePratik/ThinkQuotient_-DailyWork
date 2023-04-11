package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();
		
		list1.add("Pratik");
		list1.add(64);
		list1.add(23.25f);
		list1.add('c');
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		//System.out.println("--------------");
	}
}
