package encapsul;

public class SumOfNumber {
	
	int sum=0;
	int sum1()
	{
		
		  for(int i=1;i<=10;i++)
		  {
			sum=sum+i;  
		  }
		 return sum;//55
	}
	public static void main(String[] args) {
		SumOfNumber s=new SumOfNumber();
		System.out.println(s.sum1());//55
		
		

	}

	

}
