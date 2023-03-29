package Constructor;

public class Car {
	int c_modelno;
	String c_name;
	String c_brand;
	double c_price;
	
	Car()
	{
		System.out.println("Default Counstructor ");
	}
	
	public Car(int c_modelno, String c_name) 
	{
		System.out.println("Parameterized Counstructor 2");
		this.c_modelno = c_modelno;
		this.c_brand ="Hyundai Cars";
		this.c_name = c_name;
		this.c_price = 150000;
	}
	
	


	public Car(int c_modelno, String c_name, String c_brand, double c_price) {
		System.out.println("Parameterized Counstructor 1");
		this.c_modelno = c_modelno;
		this.c_name = c_name;
		
	}
	public void display()
	{
		System.out.println(c_modelno+" "+c_name+" "+c_brand+" "+c_price);
	}

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.display();
		System.out.println("----------------");
		Car c2 = new Car(123045,"Xcent","Hyundai",1500000);
		c2.display();
		System.out.println("-----------------");
		Car c3 = new Car(123045,"Xcent");
		c3.display();
	}

}
