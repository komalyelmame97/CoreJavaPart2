package com.java.collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("One", 1);
		tm.put("Two", 2);
		tm.put("Three", 3);
		tm.put("Four", 4);
		tm.put("Five", 5);
		System.out.println("TreeMep is:"+tm);
		System.out.println("Kay Mapping:"+tm.entrySet());
		System.out.println("Keys:"+tm.keySet());
		System.out.println("value:"+tm.values());
		//System.out.println("Remove value:"+tm.remove(1));
		
		
	}

}
