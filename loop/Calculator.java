import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		float a = sc.nextFloat();
		System.out.println("Enter Second number :");
		float b = sc.nextFloat();
		System.out.println("Enter the operator :");
		String s = sc.next();
		float c = a+b;
		float d = a-b;
		float e = a*b;
		float f = a/b;
	if (s=="+")
	{	
	 System.out.println("Addition of two no is "+c);
	} 
	else if(s=="-")
	{
	 System.out.println("Substraction of two no is "+d); 
    }
	else if(s=="*")
	{
	 System.out.println("Multiplication of two no is "+e); 
	}
	else if(s=="/")
	{
	 System.out.println("Division of two no is "+f); 
	}
	else
	{
	 System.out.println("Invalid input");
	}
  }
}
