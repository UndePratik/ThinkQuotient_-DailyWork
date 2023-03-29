
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Withdraw Amount :");
		int amount = scan.nextInt();
		int total=0;
		int temp = 0;		
		
 
			if(amount>0){
				System.out.println("//////ATM Machine Calculator//////");
		    int div = amount/2000;
		    temp =div;
		    div = div*2000;
		    total = amount - div;
		    
//		    System.out.println("remaining amount "+total);
		    System.out.println("2000 : "+temp);
//		    total = total/500;
//		    temp = total;
//		    total = total*500;
		    div = total/500;
		    temp =div;
		    div = div*500;
		    total = total - div;
		    
//		    System.out.println("remaining amount "+total);
		    System.out.println("500 : "+temp);
		    div = total/100;
		    temp =div;
		    div = div*100;
		    total = total - div;
//		    System.out.println("remaining amount "+total);
		    System.out.println("100 : "+temp);
		    div = total/50;
		    temp =div;
		    div = div*50;
		    total = total - div;
		    
		    System.out.println("50 : "+temp);
		    System.out.println("remaining amount  "+total);
		    
		           }
		  
		 }
		
		
	}




