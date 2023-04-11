package com.arrayList;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void remove(ArrayList<Integer> a)
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(Integer i : a)
		{
			if(!a.contains(i))
			{
				al.add(i);
			}
		}
		System.out.println(al);
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(30);

		remove(list);
	}

}
