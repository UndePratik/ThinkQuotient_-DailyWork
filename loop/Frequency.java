package loop;

public class Frequency {

	public static void main(String[] args) {
		int num = 11334540;
		int rem=0;
		
		
		for(int i=0; i<=9;i++) 
		{
			int count =0;
			int temp = num;
			while(temp>0) 
			{
				rem=temp%10;
			if(rem==i) 
				{
					count++;
				}
				temp=temp/10;
			}
		if(count>0) {
		System.out.println(i+" "+count);
		}
		}
	}
}
