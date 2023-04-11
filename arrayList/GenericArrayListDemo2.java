package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		
		list1.add(56);
		list1.add(64);
		list1.add(23);
		list1.add(69);
		
		for(int i=0; i<list1.size(); i++)
		{
			int data=list1.get(i)+5;
			list1.set(i, data);
			//System.out.println(list1.get(i));
		}
		for(Integer l: list1)
		{
			System.out.println(l);
		}
	}
}
