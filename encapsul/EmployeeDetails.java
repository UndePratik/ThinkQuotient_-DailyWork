package encapsul;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("***1st Employee Details***");
		
		System.out.println("Enter the Employee id :");
		e1.setId(sc.nextInt());
		System.out.println("Enter Employee Name :");
		e1.setName(sc.next());
		System.out.println("Enter Employee Salary :");
		e1.setSalary(sc.nextDouble());
		
		Employee e2 = new Employee();
		System.out.println("***2nd Employee Details***");
		System.out.println("Enter the Employee id :");
		e2.setId(sc.nextInt());
		System.out.println("Enter Employee Name :");
		e2.setName(sc.next());
		System.out.println("Enter Employee Salary :");
		e2.setSalary(sc.nextDouble());
		
		System.out.println("--------------");
		System.out.println("Employee ID : "+e1.getId());
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Employee Salary : "+e1.getSalary());
		System.out.println("-----------------");
		System.out.println("Employee ID : "+e2.getId());
		System.out.println("Employee Name : "+e2.getName());
		System.out.println("Employee Salary : "+e2.getSalary());
		

	}

}
