package com.arrayList;

import java.util.ArrayList;

public class TwoArrayOperations {

	public static void commonElements(ArrayList<String>list1,ArrayList<String> list2)
	{
		ArrayList<String> list3 = new ArrayList<>();
		for(int i=0; i<list1.size(); i++)
		{
			/*int count =0;
			for(int j=0; j<list2.size(); j++)
			{
				if(list1.get(i).equals(list2.get(j)))
				{
					count++;
					break;
					
				}
			}
			if(count==1)
			{
				
					list3.add(list1.get(i));
				
				
			}
			
		}
		System.out.println(list3);*/
			if(list1.contains(list2.get(i)))
			{
				System.out.println(list1.get(i));
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
			
			list1.add("Java");
			list1.add("Python");
			list1.add("Angular");
			list1.add("C");
			list1.add("html");
			
		ArrayList<String> list2 = new ArrayList<>();
			
			list2.add("Java");
			list2.add("Python");
			list2.add("Swift");
			list2.add("Andriod");
			list2.add("html");
			
			
			commonElements(list1,list2);
			
			
	}

}
