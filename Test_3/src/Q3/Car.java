package Q3;

public class Car {
	  int carid;
	  String brand;
	  int modelnumber;
	  int price;
	  String fuel;
	  
	  public void enterDetails(int carid, String brand, int modelnumber) {
	    this.carid = carid;
	    this.brand = brand;
	    this.modelnumber = modelnumber;
	  }
	  
	  public void enterDetails(int carid, String brand, int modelnumber, int price) {
	    this.carid = carid;
	    this.brand = brand;
	    this.modelnumber = modelnumber;
	    this.price = price;
	  }
	  
	  public void enterDetails(int carid, String brand, int modelnumber, int price, String fuel) {
	    this.carid = carid;
	    this.brand = brand;
	    this.modelnumber = modelnumber;
	    this.price = price;
	    this.fuel = fuel;
	  }
	  void displayDetails() {
	        System.out.println("Car ID: " + carid);
	        System.out.println("Brand: " + brand);
	        System.out.println("Model Number: " + modelnumber);
	        System.out.println("Price: " + price);
	        System.out.println("Fuel: " + fuel);
	    }
	  
	  public static void main(String[] args) {
		  System.out.println("-----Car Info------");
		Car c1 = new Car();
		c1.enterDetails(101, "Tata", 12354);
		c1.displayDetails();
		System.out.println("----------------");
		Car c2 = new Car();
		c2.enterDetails(101, "Tata", 12354,500000);
		c2.displayDetails();
		System.out.println("----------------");
		Car c3 = new Car();
		c3.enterDetails(101, "Tata", 12354,500000,"Diseal");
		c3.displayDetails();
	}
	}
