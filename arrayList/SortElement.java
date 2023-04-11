package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SortElement {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
	/*	
		
		list.add(1);
		list.add(3);
		list.add(-5);
		list.add(-7);
		list.add(10);
		list.add(-12);
		
		System.out.println(list);*/
		
		for(int i=0; i<7; i++)
		{
			list.add(sc.nextInt());
		}
		
		//ArrayList<Integer> swapElement = new ArrayList<>();
		int temp;
		for(int i=0; i<list.size(); i++)
		{
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i)>list.get(j))
				{
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
					
				}
				
				
			}
		}
		System.out.println(list);
		
	}

}
