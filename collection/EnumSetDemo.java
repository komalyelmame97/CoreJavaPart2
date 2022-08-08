package com.java.collection;


import java.util.EnumSet;
import java.util.Iterator;

enum Color{
	red,pink,green,blue,white,black;
  	}


public class EnumSetDemo {

  
		public static void main(String[] args) {
	    EnumSet<Color> c = EnumSet.noneOf(Color.class);
		System.out.println("Empty Enum:"+c);
		
		EnumSet<Color> c1 = EnumSet.range(Color.green,Color.black);
		System.out.println("Range Enum"+c1);
		c1.add(Color.valueOf("blue"));
		
		Iterator<Color> itr = c.iterator();
		System.out.println("Element in set are:");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("Add to Enumset"+c1);
		
	}

}
