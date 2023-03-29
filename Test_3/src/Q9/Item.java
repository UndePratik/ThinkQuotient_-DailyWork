package Q9;

public class Item {
	int itemId;
	  String itemName;
	  double price;
	  int quantity;
	  
	  Item(int itemId, String itemName, double price, int quantity) {
	    this.itemId = itemId;
	    this.itemName = itemName;
	    this.price = price;
	    this.quantity = quantity;
	  }
	  
	  double getTotal() {
	    return price * quantity;
	  }
	  
	  void display() {
	    System.out.println("Item ID: " + itemId);
	    System.out.println("Item Name: " + itemName);
	    System.out.println("Price: " + price);
	    System.out.println("Quantity: " + quantity);
	  }
}
