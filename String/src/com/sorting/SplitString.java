package com.sorting;

import java.util.Scanner;

public class SplitString {

	public static void splitString(String st)
	{
		int noOfWords=0;
		String words[]=st.split(" ");
		for(String w:words)
		{
			System.out.println(w);
			noOfWords++;
		}
		System.out.println("Number of Words : "+noOfWords);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter line :");
		String str = sc.nextLine();
		splitString(str);
	}

}
