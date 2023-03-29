package practise;
//Write a Java program to count occurrences of a character in given string.
public class CountOccurance {
	
	public static void countOccurance(String s)
	{
		char ch1[]=s.toCharArray();
		int count;
		
		for(int i=0; i<ch1.length; i++)
		{
			count=1;
			if(ch1[i]==1)
				continue;
			for(int j=i+1; j<ch1.length; j++)
			{
				if(ch1[i]==ch1[j]) {
				count++;
				ch1[j]=1;
				}
			}
			System.out.println(ch1[i]+" "+count);
		}
	}
	public static void main(String[] args) {
		//char ch[] = {'a','b','c','f','h','b','c','n'};
		String s = "Hello";
		countOccurance(s);
	}
	

}
