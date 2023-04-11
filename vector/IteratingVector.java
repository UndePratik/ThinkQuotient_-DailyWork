package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String[] args) {

      // addElement
	// Enumeration: hasMoreElements
		// nextElement
	// failsafe: allows modification while iteration
		
		Vector<String> names= new Vector<>();
     	      
	      names.addElement("Vaishanvi"); // legacy method
	      names.add("Sagar");
	      names.add("Rahul");
	      names.add("Rohan");
	      names.add("Sairaj");
	      names.add("Adinath");
	      
	      System.out.println(names);
	      
	      System.out.println("/////////////////////////////////");
	      
	      Iterator<String> itr= names.iterator();
	      
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
	      
	      System.out.println("//////////////////////////////////////");
	      
	      ListIterator< String>litr= names.listIterator(names.size());
	      
	    		  
	     while(litr.hasPrevious())
	     {
	    	 System.out.println(litr.previous());
	     }
	     
	     System.out.println("//////////////////////////////////////");
	     
	     Enumeration<String> en= names.elements();
	     
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

	}

}
