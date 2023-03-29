package Exercise;
import java.util.*;

public class average {
	
	public static int averageOfThreeNumber(int a,int b, int c) {
		int ave = (a+b+c)/3;
		//System.out.println("The Average of " +a+b+c+" no is : "+ave);
		return ave;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ave = averageOfThreeNumber(a,b,c);
		System.out.println("The average of "+a+", "+b+", "+c+" no is :"+averageOfThreeNumber(a,b,c));
		
		//averageOfThreeNumber(a,b,c);
		
	}

}
