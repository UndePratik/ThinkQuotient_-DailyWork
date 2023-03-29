import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int max = number%10;
		number=number/10;
		while(number>0) {
			int rem=number%10;
			if(rem>max)
			{
				max = rem;
			}
			number=number/10;
		
		}
		System.out.println(max);
	}

}
		
		/*int rem,sum=0;
		
		int temp;
		temp = number;
		while(number>0) {
			rem=number%10;
			sum=sum*10+rem;
			number=number/10;
			
		}
		if(temp == sum)
		{
			System.out.println(number+" is Palindrome ");
		}else
			System.out.println(number+" is not palindrome");
*/
		
		
		
	