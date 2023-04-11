package com.linkedlistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("PHP");
		list.add("CSS");
		list.add(null);
		
		System.out.println(list);
		
		list.addFirst("C");
//		System.out.println(list.addFirst("C"));   error
		System.out.println(list);
		
		list.offerFirst("Python");
//		System.out.println(list.offerFirst("C"));   return true
		System.out.println(list);
		// remove poll
		list.remove(); // remove 1st ele Queue FIFO
		System.out.println(list);
		System.out.println(list.poll());
		// if list emplty show poll null val
		// if list empty remove show exception
		LinkedList<String> list2 = new LinkedList<>();
		//get peek
		//System.out.println(list2.get(0));// exception
		System.out.println(list2.peekFirst()); // return null
		
		// element return first valu
	    System.out.println(list.element());
	    
	    // Stack : push pop
	   list2.push("Swift"); // addfirst
	   System.out.println(list2);
	   // remove first
	    System.out.println( list2.pop());
	     
	    
	}

}
