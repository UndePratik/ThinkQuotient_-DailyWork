package com.arrayList;

import java.util.ArrayList;

public class FrequancyOfNumber {
	public static void countFrequancy(ArrayList<Integer>list)
	{
		int count;
		for(int i=0; i<list.size();i++)
		{
			count=0;
			if(list.get(i).equals(1))
				continue;
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, 1);
				}
			}
			System.out.println(list.get(i)+" "+count);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(30);
		
		
		countFrequancy(list);
	}

}
