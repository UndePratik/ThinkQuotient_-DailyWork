package com.arrayList;

import java.util.ArrayList;

public class CreateNewListRemoveDuplicate {
	public static void createList(ArrayList<String> list)
	{
		ArrayList<String> ulist = new ArrayList<>();
		
		for(String s:list)
		{
			if(!ulist.contains(s))
			{
				ulist.add(s);
			}
		}
		System.out.println(ulist);
	}

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		
		
		createList(list);
	}

}
