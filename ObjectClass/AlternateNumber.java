package mock;

import java.util.Arrays;
//Output> {1,11,2,21,3,31,5,41}
public class AlternateNumber {
	
	public static void alternateNumber(int arr[],int arr2[])
	{
		int arr3[]=new int[(arr.length+arr2.length)];
		
		int k=0;
		int i;
		int j = 0;
		
		for(i=0; i<arr.length; i++)
		{
			
			for(j=i; j<arr2.length; j++)
			{
//				if(arr[i]==4)
//				{
//					arr[i]=arr[i+1];
//					
//				}
				arr3[k++]=arr[i];
//				if(arr2[j]==41)
//				{
//					arr2[j]=arr2[j+1];	
//				}
				arr3[k++]=arr2[j];
				break;
			
			}
		}
		System.out.println(i+ " "+j+" "+k);
		i--;
		j--;
		k--;
		
		System.out.println(i+ " "+j+" "+k);
		while(i<arr.length) 
		{
			arr3[k++]=arr[i++];
		}
			while(j<arr2.length)
			{
				arr3[k++]=arr[j++];
			}
			
		System.out.println(Arrays.toString(arr3));
			
	}

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		int arr2[]= {11,21,31,41};
		
		//Output> {1,11,2,21,3,31,5}
		
		alternateNumber(arr,arr2);
		
	}

}
