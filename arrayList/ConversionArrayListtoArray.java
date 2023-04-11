
package com.arrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayListtoArray {
	
	public static void main(String[] args) {
		
		String subject[]= {"English","Math","Science","Computer"};
		
		//1st way
		
		List<String> sub = Arrays.asList(subject);
		System.out.println(sub);
		
		
	}
}
