package practise;

import java.util.Scanner;

public class FrequancyOfChar {
	
	public static void frequancyOfChar(char[] str)
	{
		int count;
		for(int i=0; i<str.length; i++)
		{
			count=1;
			if(str[i]==1)
				continue;
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]==str[j])
				{
					count++;
					str[j]=1;
					//break;
				}
			}
			System.out.println("Frequancy of "+str[i]+":"+count+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.println("Enter word :");
		//char str=sc.;
		char[] str= {'a','b','c','d','a','c','a'};
		frequancyOfChar(str);
	}

}
