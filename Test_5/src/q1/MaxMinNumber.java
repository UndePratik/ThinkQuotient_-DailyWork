package q1;
//Write a java program to find maximum and minimum from an array.
public class MaxMinNumber {
	public static void maxnumber(int arr[])
	{
	
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number :"+max);
	}
	public static void miniNumber(int arr[])
	{
	
		int mini = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(mini>arr[i])
			{
				mini=arr[i];
			}
		}
		System.out.println("Minimum Number: "+mini);
	}

	public static void main(String[] args) {
		int arr[] = {12,3,5,6,7,4};
		maxnumber(arr);
		miniNumber(arr);
	}
}
