package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList();
//		link.add("Komal");
//		link.addFirst("priya");
//		link.add("Amrita");
//		link.addLast("Sima");
//		System.out.println("Print Linklist:");
//		System.out.println("Print First Element:" +link.peek());
//		System.out.println("Remov first Element:" +link.poll());
//		System.out.println("Print  Linklist:"+link);
//		
		link.add("A");
		link.add("C");
		link.add("B");
		
		System.out.println("Linklist:"+link);
		Iterator x = link.descendingIterator();
		while(x.hasNext())
		{
			System.out.println("Value is:"+x.hasNext());
		}
	}

}
