package com.arrayList;

import java.util.ArrayList;

public class MethodsOfArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> stud = new ArrayList();
		stud.add("Rohit");
		stud.add("Pratik");
		stud.add("Shivam");
		stud.add(null);//null allowed
		stud.add("datta");
		stud.add("Pratik");//duplicate allowed
		stud.add(null);
		
		System.out.println(stud);
		
		stud.add(2, "Harish");
		System.out.println("-------After Adding--------");
		System.out.println(stud);
		
		ArrayList<String> stud1 = new ArrayList();
		System.out.println("-----------Second collection---------------");
		stud1.add("Suyog");
		stud1.add("Rohini");
		
		System.out.println(stud1);
		
		System.out.println("-------------After adding Collection-------------");
		stud.addAll(2, stud);
		System.out.println(stud);
		
		System.out.println("-------------After Remove-------------");
		stud.remove("Pratik");//remove first occurance
		System.out.println(stud);
		
		System.out.println("-------------After RemoveAll-------------");
		stud.removeAll(stud1);//remove first occurance
		System.out.println(stud);
		stud.addAll(stud1);
		stud.addAll(stud);
		
		
		System.out.println("---------------Retain all-----------------");
		stud.retainAll(stud1);
		System.out.println(stud);
		
		System.out.println("Size: "+stud.size());
	}
}
