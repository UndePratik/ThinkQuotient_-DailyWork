package practise;

import java.util.Arrays;

//WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s1 = "HELLO$WORLD";
		//char ch[] = s1.toCharArray();
		String ns = "";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='$')
			{
				ns=s1.replace("$", " ");
			}
		
		
	}
		String [] a= ns.split(" ");
		System.out.println(Arrays.toString(a));
		
		/*
		        String[] tokens = s1.split("\\$");
		        System.out.println("First Token: " + tokens[0]);
		        System.out.println("Second Token: " + tokens[1]);
		*/
	}
}
