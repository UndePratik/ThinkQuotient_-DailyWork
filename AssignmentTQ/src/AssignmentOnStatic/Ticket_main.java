package AssignmentOnStatic;

import java.util.Scanner;

public class Ticket_main {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("Enter ticket id : ");
		int id = sc.nextInt();
		System.out.println("Enter available tickets ");
		int availableTickets =sc.nextInt();
		System.out.println("Enter ticket price :");
		int price = sc.nextInt();
		System.out.println("Enter the no of booking ");
		int nooftickets = sc.nextInt();
		
		t.setTicketid(id);
		t.setAvailableTickets(availableTickets);
		t.setPrice(price);
		t.calculateTicketCost(nooftickets);
		t.availableticket(nooftickets);
		

	}

}










/*String choice;
public void choice(int a_ticket) {
if(a_ticket>0) {
	do {
		
	
	System.out.println("Do you want book more ticket \n type Yes or No :");
	String choice = sc.next();
	switch(choice) {
	case "Yes":
		
		
	
	}
	}while(choice != "");
}

}

*/