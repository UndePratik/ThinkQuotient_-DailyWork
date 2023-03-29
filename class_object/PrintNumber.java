package class_object;

public class PrintNumber {
	
	
	PrintNumber()
	{
		System.out.println("defualt constructor is called");
	}
	
	/*PrintNumber(int x)
	{
		System.out.println(x);
	}*/
	
	 void check(int age)
	{
		if(age>18)
		{
			display("Eligibel to vote");
		}
	
		
	}
	void display(String msg)
	{
		System.out.println(msg);
	}
	

	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		//PrintNumber p1=new PrintNumber(10);
		p.check(20);
		

	}

}
