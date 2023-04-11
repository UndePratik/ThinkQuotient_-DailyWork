package Assignment_7;

public class Que_16 {

	public static void main(String[] args) {
		int arr[] = {4,6,5,-10,8,5,20};
		int sum = 10;
		
		 getPairsCount(arr, sum);
    }
 
    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0; // Initialize result
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.printf("Count of pairs is %d", count);
    
 
		
		/*for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}*/

	}

}
