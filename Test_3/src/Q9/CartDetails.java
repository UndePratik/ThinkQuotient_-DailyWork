package Q9;

public class CartDetails {

	public static void main(String[] args) {
		
		    Item item1 = new Item(1, "Apple", 10, 2);
		    Item item2 = new Item(2, "Banana", 5, 4);
		    Item item3 = new Item(3, "Orange", 15, 3);
		    Item item4 = new Item(4, "Grapes", 20, 2);
		    Item item5 = new Item(5, "Watermelon", 30, 1);
		    
		    ShoppingCart cart1 = new ShoppingCart(item1, item2, item3, item4, item5);
		    ShoppingCart cart2 = new ShoppingCart(item1, item2, item3, item4, item5);
		    
		    System.out.println("Cart 1 Details:");
		    cart1.displayCartDetails();
		    
		    System.out.println("\nCart 2 Details:");
		    cart2.displayCartDetails();

	}

}
