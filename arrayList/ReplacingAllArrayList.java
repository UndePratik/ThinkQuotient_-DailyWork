package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReplacingAllArrayList {
	
	public static void replace(ArrayList<String> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			//if(list.get(i)."")
			{
				
			}
		}
	}
	public static void sortArray(ArrayList<String> list)
	{
		String temp;
		for(int i=0; i<list.size(); i++)
		{
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i).compareTo(list.get(j))>0)
				{
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(i, temp);
					
					
				}
			}
		}
	}
	public static void reverse(ArrayList<String> list)
	{
		ListIterator<String> itrf = list.listIterator();
		ListIterator<String> itrr = list.listIterator(list.size());
		
		String temp;
		for(int i=0, j=list.size()-1; i<list.size()/2;i++,j--)
		{
			
		}
		
		
		
	}
	public static void newArrayList(ArrayList<String> list)
	{
		ArrayList<String> list1 = new ArrayList<>();
		for(int i=0; i<list.size(); i++)
		{
			
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList();
		list.add("Pratik");
		list.add("Rohit");
		list.add("Datta");
		list.add("Shivam");
		list.add("Harish");
		list.add("Krishna");
		
		replace(list);
		sortArray(list);

	}

}
