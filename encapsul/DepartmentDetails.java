package encapsul;

import java.util.Scanner;

public class DepartmentDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Department d1 = new Department();
		Department d2 = new Department();
		Department d3 = new Department();
		System.out.println("Enter Department id : ");
		d1.setDept_id(sc.nextInt());
		System.out.println("Enter Department name :");
		d1.setDept_name(sc.next());
		System.out.println("Enter Department location :");
		d1.setDept_location(sc.next());
		System.out.println("Enter Department Head name :");
		d1.setDept_head(sc.next());
		
		System.out.println("----------------------");
		System.out.println("Department ID : "+d1.getDept_id());
		System.out.println("Department Name : "+d1.getDept_name());
		System.out.println("Department Location : "+d1.getDept_location());
		System.out.println("Department Head Nmae : "+d1.getDept_head());

	}

}
