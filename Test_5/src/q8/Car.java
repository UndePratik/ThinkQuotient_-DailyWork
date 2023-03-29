package q8;

public class Car {

	int modelno;
	Machine m;
	
	public Car(int modelno, Machine m) {
		
		this.modelno = modelno;
		this.m = m;
	}
	
	public static void main(String[] args) {
		 	Engine engine1 = new Engine("Petrol", 500000);
	        Machine machine1 = new Machine("Manual", engine1);
	        Car car1 = new Car(2022, machine1);
	        
	        // Second way to assign values
	        Car car2 = new Car(2023, new Machine("Automatic", new Engine("Diesel", 700000)));
	}
	
}
