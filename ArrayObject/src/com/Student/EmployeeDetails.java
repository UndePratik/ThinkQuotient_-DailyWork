package com.Student;

import java.util.Scanner;

public class EmployeeDetails {
	
	static Scanner sc = new Scanner(System.in);
	public static void enterEmployeeDetails(Employee emp) {
		for(int i=0; i<emp.getAge(); i++) {
			System.out.println("Enter details of employee #" + (i+1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Age: ");
            int Age = sc.nextInt();

		}
	}

	public static void main(String[] args) {
		Employee emp[]=new  Employee[3];
		
		

	}

}
