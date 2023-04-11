package com.customArrayList;
import java.util.ArrayList;


public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Rohit",12030.0f,21));
		list.add(new Employee(2,"Pratik",11030.0f,22));
		list.add(new Employee(3,"Datta",13030.0f,23));
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}
}
