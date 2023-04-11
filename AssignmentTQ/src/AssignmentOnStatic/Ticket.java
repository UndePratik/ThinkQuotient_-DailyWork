package AssignmentOnStatic;


public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;
	
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	
	public void calculateTicketCost(int nooftickets) {
		if(availableTickets>nooftickets) {
			int total = nooftickets*price;
			System.out.println("Total price of Tickets is "+total);
		}else
		 System.out.println("Sorry guys tickets is full");
	}
	
	public void availableticket(int noofTickets) {
		int a_ticket = availableTickets-noofTickets;
		System.out.println("Available Tickets are : "+a_ticket);
	}
	}
