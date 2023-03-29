package com.sorting;

import java.util.Arrays;
public class SortingString {
	
	public static void sortString(String st[])
	{
		String temp;
		for(int i=0; i<st.length; i++)
		{
			for(int j=i+1; j<st.length; j++)
			{
				if(st[i].compareTo(st[j])>1)
				{
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}
	
	
	public static void sortString1(String st[]) {
		 // sort the array in alphabetical order
        Arrays.sort(st);

        // print the sorted array
        for (String s : st) {
            System.out.print(s+" ");
        }
	}
	
	
	

	public static void main(String[] args) {
		 String st[] = {"Java", "Python", "C++", "Swift","ASP"};
		 //sortString(st);
	       /**/
		sortString1(st);
		 
	}

}
