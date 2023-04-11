package AssignmentOnStatic;
//Create a class Car with String model and inttotalCarSold as static variable in main() method.
public class Car {
	static String model="swift";
	static int totalCarSold = 10;
	
	static void change(){
		model = "fortuner";
	}
	
	static void display()
	{
	System.out.println(model+" model "+totalCarSold+" car sold");	
	}
	
	
	public static void main(String[] args) {
		Car.change();
		display();

	}

}
