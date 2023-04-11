package com.Assignment_2;
/*4. Write a Java program to input basic salary of an employee and calculate its
Gross salary according to following -
		Basic Salary <= 10000: HRA = 20%, DA = 80%
		Basic Salary <= 20000: HRA = 25%, DA = 90%
		Basic Salary >20000: HRA = 30%, DA = 95%
*/
import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		int salary = sc.nextInt();
		float HRA,DA,total;
		System.out.println("-----------------");
		
		if(salary<=10000) {
			 HRA= salary*0.2f;
			 DA=salary*0.8f;
			 total = salary+HRA+DA;
			 System.out.println("You got salary include HRA allowance "+HRA+" and DA allowance "+DA+" :"+total);
		}else if(salary<=20000){
			HRA= salary*0.2f;
			DA=salary*0.8f;
			total = salary+HRA+DA;
			System.out.println("You got salary include HRA allowance "+HRA+" and DA allowance "+DA+" :"+total);
		}else if(salary>20000) {
			HRA= salary*0.2f;
			DA=salary*0.8f;
			total = salary+HRA+DA;
			System.out.println("You got salary include HRA allowance "+HRA+" and DA allowance "+DA+" :"+total);
		}else
			System.out.println("Invalid input!!!!");

	}

}
