package com.java.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("komal", 5);
		ht.put("Kaveri", 10);
		ht.put("Maya",15);
		ht.put("amruta", 20);
		ht.put("supriya", 25);
		System.out.println("Initial Hash Table:"+ht);
		
		ht.put("Shubh", 5);
		System.out.println("Update Hash Table:"+ht);
		
		

	}

}
