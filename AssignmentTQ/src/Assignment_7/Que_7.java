package Assignment_7;

public class Que_7 {

	public static void main(String[] args) {
		int arr[] = {2,3,16,15,3,2};
		int flag = 0;
		int count=0;
		
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--) {
			
			if(arr[i]==arr[j])
			{
				flag=1;
				count++;
			}
		}
	if(flag==1 && count==arr.length/2)
	{
		System.out.println("equal");
	}
	else
		System.out.println("not equal");

	}

}
