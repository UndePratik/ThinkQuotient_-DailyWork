package assignment31_Dec;

import java.util.Scanner;

/*7  create class Employee
int id;
String name;
static string company_name;
show methods where u can use static variables and methods.*/


public class Employee {
	int id;
	String name;
	static String company_name;
	
	

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Employee Id is    : "+id);
		System.out.println("Employee name is  : "+name);
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name...");
		String name = sc.next();
		System.out.println("Enter your id...");
		int id = sc.nextInt();
		
		company_name = "Google";
		System.out.println("Company name is   : "+company_name);
		
		Employee e = new Employee(id,name);
		e.display();
		

	}

}
