package inheritance.arrg;

import java.util.Scanner;
class Employee{
	int e_id;
	String e_name;
	String e_role;
	Company c;
	public Employee(int e_id,String e_name,String e_role,Company c)
	{
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_role=e_role;
		this.c=c;
	}
	

	

	public Employee()
	{
		
	}




	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}




	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	
	@Override
	public String toString() {
		return e_id + " " + e_name + "  " + e_role + " " + c;
	}




	public String getE_role() {
		return e_role;
	}
	public void setE_role(String e_role) {
		this.e_role = e_role;
	}




	public Company getC() {
		return c;
	}
	public void setC(Company c) {
		this.c = c;
	}

}

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Employee id...");
		int e_id = sc.nextInt();
		System.out.println("Enter employee name...");
		String e_name = sc.next();
		System.out.println("Enter the role of employee...");
		String e_role = sc.next();
		
		System.out.println("Enter Company name...");
		String c_name = sc.next();
		System.out.println("Enter Comapny location...");
		String c_location = sc.next();
		
		Employee e = new Employee();
		e.setE_id(e_id);
		e.setE_name(e_name);
		e.setE_role(e_role);
		
		Company c=new Company();
		e.setC(c);//0x200
		e.getC().setC_name(c_name);
		e.getC().setC_location(c_location);
		
		System.out.println(e.getE_id());
		System.out.println(e.getE_name());
		System.out.println(e.getE_role());
		System.out.println("----------------");
		System.out.println(e.getC().getC_name());
		System.out.println(e.getC().getC_location());
		

	}

}
