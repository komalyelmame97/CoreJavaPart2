package com.java.collection;

import java.util.Stack;

public class Stacklist {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Check stack is empty or not:"+s.empty());
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(2);
		s.add(3);
		s.push(10);
		s.push(15);
		s.add(7);
		System.out.println("Element of stack:"+s);
		System.out.println("Check stack is empty or not:"+s.isEmpty());
		System.out.println("Last Element is Remove:");
		s.pop();
		System.out.println("Element of stack:"+s);
		System.out.println("Element of stack:"+s.peek());
		System.out.println("searching Element of the possition:"+s.search(5));
		s.search(5);
		System.out.println("Capacity of stack:"+s.capacity());
		
		System.out.println("IndexOf vector list:"+s.indexOf(15));
		System.out.println("Last IndexOf vector list:"+s.lastIndexOf(15));
		
		
	}

}
