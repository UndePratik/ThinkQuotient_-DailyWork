package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {

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
		
		System.out.println("==================SubList===============");
		List<String> list1 = stud.subList(2, 4);
		System.out.println(list1);
		
		System.out.println("Contain Pratik: "+stud.contains("Pratik"));
		
		for(int i=0; i<stud.size();i++)
		{
			if(stud.get(i)==("Pratik"))
			{
				stud.remove(i);
			}
		}
		System.out.println("-------------After Rmoving-----------");
		System.out.println(stud);
		
		//Collection
		//stud.removeAll(Collections.singleton("datta"));
	}
}
