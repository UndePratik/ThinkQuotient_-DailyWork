package practise;

import java.util.Scanner;

public class ReplaceVowel {
	
public static void replaceVowels(String arr) {
		
		
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)=='A'||arr.charAt(i)=='E'||arr.charAt(i)=='I'||arr.charAt(i)=='O'||arr.charAt(i)=='U') {
				arr = arr.replace(arr.charAt(i),'@');
				
			}
		}

		
		
		System.out.println(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String arr = sc.next().toUpperCase();
		
		replaceVowels(arr);
	}

}
