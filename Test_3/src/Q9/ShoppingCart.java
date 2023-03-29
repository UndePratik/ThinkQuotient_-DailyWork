package Q9;

public class ShoppingCart {
	Item item1;
	  Item item2;
	  Item item3;
	  Item item4;
	  Item item5;
	  
	  ShoppingCart(Item item1, Item item2, Item item3, Item item4, Item item5) {
	    this.item1 = item1;
	    this.item2 = item2;
	    this.item3 = item3;
	    this.item4 = item4;
	    this.item5 = item5;
	  }
	  
	  double getTotalBill() {
	    return item1.getTotal() + item2.getTotal() + item3.getTotal() + item4.getTotal() + item5.getTotal();
	  }
	  
	  void displayCartDetails() {
	    System.out.println("\nCart Details:");
	    item1.display();
	    item2.display();
	    item3.display();
	    item4.display();
	    item5.display();
	    System.out.println("\nTotal Bill: " + getTotalBill());
	  }
}

