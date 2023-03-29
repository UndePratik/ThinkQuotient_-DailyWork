package q9;

public class Duplicate {

	public static void deletDuplicate(int arr[])
	{
		int temp = 0;
		int count;
		for(int i=0; i<arr.length; i++) 
		{
			count=0;
			for(int j=0; j<arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		System.out.print(count+" ");
		}
		//System.out.println(count);
	}
	public static void deletDuplicateChar(char ch[])
	{
		int temp = 0;
		int count;
		boolean isduplicate=false;
		char unique[]=new char[ch.length];
		int index=0;
		for(int i=0; i<ch.length; i++) 
		{
			count=0;
			for(int j=0; j<ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					isduplicate=true;
					count++;
					break;
				}
				
			}
		//System.out.print(count+" ");
		if (!isduplicate)
			{
            unique[index++] = ch[i];
			}
		System.out.println(unique[index]);
		}
		
		//System.out.println(count);
	}
	public static void main(String[] args) {
		//input :[a,b,b,n,u,y,x,s,y]
		//output: [a,n,u,x,s]
		
		char ch[]= {'a','b','b','n','u','y','x','s','y'};
		//int arr[] = {1,2,4,3,2,1,3};
		//deletDuplicate(arr);
		deletDuplicateChar(ch);
	}

}
