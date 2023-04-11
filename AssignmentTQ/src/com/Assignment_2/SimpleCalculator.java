package com.Assignment_2;
/*5. Write a Java program to create a Simple Calculator using switch. Program should accept
2 numbers. Console will display following choices -
	1. Add 2. Subtract 3. Multiply 4. Divide
	Based on user input, perform given operation.
*/
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operator (+,-,/,*): ");
		char op = sc.next().charAt(0);
		System.out.println("Enter first Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter first Number : ");
		int num2 = sc.nextInt();
		
		switch(op)
		{
		case '+':
			System.out.println("Addition of "+num1+" and "+num2+" is :"+(num1+num2));
			break;

		case '-':
			System.out.println("Substraction of "+num1+" and "+num2+" is :"+(num1-num2));
			break;

		case '*':
			System.out.println("Multiplication of "+num1+" and "+num2+" is :"+(num1*num2));
			break;
			
		case '/':
			System.out.println(num1+" divided by "+num2+" is :"+(num1/num2));
			break;
		default:
			System.out.println("ERROR!!!!!");
		}
	}

}
