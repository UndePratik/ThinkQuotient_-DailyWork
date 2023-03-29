package q11;

import java.util.Arrays;
//op  => {1 21 3 41}
public class ZigzagNumber2{

	public static void zigZagNumber(int arr[],int brr[]) {
		int c[] = new int[6];
		int k=0;
		int i;
		int j = 0;
		for(i=0;i<arr.length;i+=2) {
			
			for(j=i+1;j<brr.length;j+=2)
			{
				c[k++] = arr[i];
				c[k++]=brr[j];
				break;
				
			}
			
			
		}
		
		
		
		System.out.println(Arrays.toString(c));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[] = {11,21,31,41,56,23};
		//op  => {1 21 3 41}
		
		
		zigZagNumber(a,b);

	}

}