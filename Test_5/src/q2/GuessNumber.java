package q2;

import java.util.Scanner;

//Write a program in which computer asks user to guess the fixed number. Continue till user guesses correct number.
//If user guesses higher number ask user to guess lower number and vice versa.
public class GuessNumber {

	public static void main(String[] args) {
		int number = 50;
		Scanner sc  = new Scanner(System.in);
		int guess;
		do {
			System.out.println("Guess the Number:");
			guess = sc.nextInt();
			
			if(guess<number)
			{
				System.out.println("Enter large number :");
			}
			else if(guess>number){
				System.out.println("Enter small number :");
			}
			else
			{
				System.out.println("You guess it");
			}
		}while(guess != number);
	}
}
