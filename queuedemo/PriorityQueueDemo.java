package com.queuedemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

      PriorityQueue<String> pq= new PriorityQueue<>();
      // unbounded : size restriction
      
      // default capacity:11
      // grows : <64: doubles
      //          >64 : grows 50%
     pq.add("Priya");
     pq.add("Adinath");
     pq.add("Vivek");
     pq.add("Bhushan");
     
     // default Comparator
     
   //  pq.add(null); Runtime error
     // Comparable cannot compare any object with null value
     
     
     Iterator<String> itr= pq.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     

	}

}
