package com.java.collection;

import java.util.Collection;
import java.util.Vector;

public class vectorCollection {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Komal");
		v.addElement("Ankita");
		v.add("Pooja");
		v.add("Pooja");
		v.add("Maya");
		System.out.println("Vector list:"+v);
		System.out.println("Vector Last Element is:"+v.lastElement());
		System.out.println("Display Element of index position 3 vector :"+v.get(3));
		System.out.println("Set Element:"+v.set(3, "Mina"));
		System.out.println("Vector list:"+v);
		System.out.println("Capacity vector list:"+v.capacity());
//		Collection.sort(v);
//		System.out.println("Vector list:"+v);
		
		
		System.out.println("Vector list:"+v);
		System.out.println("Sorted vector list:"+v);
		System.out.println("IndexOf vector list:"+v.indexOf("Pooja"));
		System.out.println("Last IndexOf vector list:"+v.lastIndexOf("Pooja"));
		
	}

}
