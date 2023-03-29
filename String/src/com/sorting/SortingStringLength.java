package com.sorting;

import java.util.Arrays;
public class SortingStringLength {
	
	public static void sortStringLength(String st[])
	{
		String temp;
		for(int i=0; i<st.length; i++)
		{
			for(int j=i+1; j<st.length; j++)
			{
				if(st[i].length()==st[j].length()) 
				{
					if(st[i].compareTo(st[j])>1)
					{
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					}
				}else{
					if(st[i].length()>st[j].length()) 
					{
						temp=st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		 String st[] = {"Java", "Python", "C++", "Swift","ASP"};
		
		 sortStringLength(st);
		 
	}

}
