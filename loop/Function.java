import java.util.*;

public class Function {
/*	//Declering Function
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
	 
		//Function Calling
		printMyName(name);
	
*/
/*	//Declaring Function
	public static int additionOfTwoNumber(int a, int b) {
			int sum = a+b;
			return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = additionOfTwoNumber(a,b);
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
		}
*/
	public static int mulOfTwoNumber(int a, int b) {
		int mul = a*b;
		return mul;
	}
	public static void main(String arg[]) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mul = mulOfTwoNumber(a,b);
		System.out.println("Multiplicatiion of Two number is : "+mulOfTwoNumber(a,b));
	}
	
	}
	
	

