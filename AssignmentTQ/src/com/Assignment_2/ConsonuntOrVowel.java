package com.Assignment_2;

import java.util.Scanner;

//Write a Java program to input any alphabet and check whether it is vowel or consonant.
public class ConsonuntOrVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet :");
		char ch = sc.next().charAt(0);
	
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is a Vowel");
			break;
		default:
			System.out.println(ch+" is a consonant");
			
		}
		sc.close();
	}

}
