package com.sorting;

public class FrequancyOfWords {
	public static void frequancyWord(String s)
	{
		String[] ch=s.split(s);
		int count;
		for(int i=0; i<ch.length; i++)
		{
			count=1;
			if(ch[i]=="Visited"||ch[i]==" ")
				continue;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]="Visited";
				}
			
			
			}
			System.out.println(ch[i]+" :"+count);
		}
	}

	public static void main(String[] args) {
		String str="Java is program ";

		frequancyWord(str);
	}

}
