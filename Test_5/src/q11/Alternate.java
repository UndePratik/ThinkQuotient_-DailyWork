package q11;

import java.util.Arrays;

public class Alternate{

	public static void alternatearray(int arr[],int brr[]) {
		int c[] = new int[(arr.length+brr.length)];
		int k=0;
		int i;
		int j = 0;
		for(i=0;i<arr.length;i++) {
			
			for(j=i;j<brr.length;j++) {
//				if(arr[i] == 4) {
//					arr[i] = arr[i+1];
//				}
//				
					
				 
				c[k++] = arr[i];
				c[k++]=brr[j];
				break;
				
			}
			
			
		}
		System.out.println(i+" "+j+ " "+k);
		i--;
		j--;
		k--;
		System.out.println(i+" "+j+ " "+k);
		
		while(j<brr.length) {
			c[k++] = brr[j++];
		}
//			System.out.println(i+" "+j+ " "+k);
			while(i<arr.length) {
				c[k++] = arr[i++];
			
}
		System.out.println(Arrays.toString(c));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[] = {11,21,31,41};
		//op  => {1 21 3 41}
		//op2  => {1 21 3 41 11 2 31 5}
		//op c[] = {1, 11, 2, 21, 3, 31, 5, 41}
		
		alternatearray(a,b);

	}

}