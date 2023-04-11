package com.arrayList;

import java.util.ArrayList;

public class SearchElement {
	
	public static void searchElements(ArrayList<String> list)
	{
		boolean status = false;
		String s = "A";
		for(String str:list)
		{
			if(str.equals(s))
			{
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("Elements not found");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		searchElements(list);

	}

}
