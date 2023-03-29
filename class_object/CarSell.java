package class_object;

public class CarSell {
	
	String c_name = "Swift";
	int cm_no = 1012301;
	String c_color = "red";
	double c_price = 500000;
	
	void display()
	{
		System.out.println("Car name is..."+c_name);
		System.out.println("Car model number..."+cm_no);
		System.out.println("Car color is..."+c_color);
		System.out.println("Car price is..."+c_price);
	}
	
	void priceDiscount()
	{
		if(c_price>10000) {
			
			c_price = c_price-5000;
			System.out.println("You got a 5000 discount in your car order");
			System.out.println(c_price);
		}
	}

	public static void main(String[] args) {
		CarSell c = new CarSell();
		c.display();
		c.priceDiscount();

	}

}
