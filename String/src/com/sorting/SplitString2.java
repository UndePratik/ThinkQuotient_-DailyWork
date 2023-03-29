package com.sorting;

import java.util.Scanner;

public class SplitString2 {

	public static void splitStringWithoutusingSplit(String st)
	{
		String word="";
		String splitstr[]=new String[20];
		int temp=0;//store index
		st=st+' ';
		
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
			{
				word=word+st.charAt(i);
			}
			else//found space
			{
				splitstr[temp]=word;
				temp++;
				word="";
			}
		}
		
		for(int i=0; i<temp;i++)
		{
			System.out.println(splitstr[i]);
		}
		System.out.println("number of words:"+temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter line :");
		String str = sc.nextLine();
		splitStringWithoutusingSplit(str);
	}

}
