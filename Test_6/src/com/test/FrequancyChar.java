package com.test;

public class FrequancyChar {
	
	public static void frequancyChar(char ch[])
	{
		int count;
		for(int i=0; i<ch.length; i++)
		{
			count=1;
			if(ch[i]==1)
				continue;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=1;
				}
			}
			System.out.println("Frequancy of: "+ch[i]+" is: "+count);
		}
	}

	public static void main(String[] args) {
		char ch[] = {'a','b','c','d','c','e','d'};
		frequancyChar(ch);
	}
}
