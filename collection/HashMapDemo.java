package com.java.collection;

import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Red", 1);
		hm.put("Pink", 2);
		hm.put("Blue", 1);
		hm.put("Purple", 3);
		hm.put("Green", 5);
		
		for(Map.Entry<String,Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());	
		}
		System.out.println("Check if empty:"+hm.isEmpty());
		System.out.println("Check if key present:"+hm.containsKey("Black"));
		System.out.println("Check size of hashmap:"+hm.size());
		hm.replace("Blue", 4);
		System.out.println("Replace:"+hm.get("Blue"));
	}

}
