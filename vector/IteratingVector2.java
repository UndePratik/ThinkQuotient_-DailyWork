package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector2 {

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
	      
	          
	     System.out.println("//////////////////////////////////////");
	     
	     Enumeration<String> en= names.elements();
	     
		while(en.hasMoreElements())
		{			
          String st= en.nextElement();
          if(st.equals("Rohan"))
          {
        	  names.remove("Rohan");
          }
         
		}
		
		System.out.println(names);

	}

}
