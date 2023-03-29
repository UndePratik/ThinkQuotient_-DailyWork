package com.sorting;

import java.util.Scanner;

public class DuplicateWord {

	public static void splitString(String st)
	{
	
		String words[]=st.split(" ");
		for(String w:words)
		{
			System.out.println(w);
			
			
		}
		
		int count;
		for(int i=0; i<words.length; i++)
		{
			count=1;
			if(words[i].equals(" ")||(words[i].equals("visited")))
				continue;
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="visited";
					//break;
				}
			}
			if(count>1)
			count++;
				System.out.println("Dulicate element "+words[i]+" :"+count);
			System.out.println(words[i]+":"+count);
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter line :");
		String str = sc.nextLine();
		splitString(str);
	}

}
