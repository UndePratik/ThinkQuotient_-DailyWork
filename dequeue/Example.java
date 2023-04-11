package com.dequeue;

import java.util.ArrayDeque;

public class Example {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add some elements to the deque
        deque.add("element1");
        deque.add("element2");
        deque.add("element3");

        // Add a null element to the deque
        deque.add(null);

        // Print the elements of the deque
        System.out.println(deque);
    }
}