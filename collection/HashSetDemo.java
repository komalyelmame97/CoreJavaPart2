package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet<String> hset = new HashSet<String>();
//		hset.add(null);
//		hset.add("Komal");
//		hset.add("Amruta");
//		hset.add("Ankita");
//		hset.add("Shubha");
//		
//		System.out.println("Print set");
//		System.out.println("Print set"+hset);
//		System.out.println("Size of set:"+hset.size());
//		System.out.println("Remove set:"+hset.remove("Shubh"));
//		System.out.println("Print set"+hset);
//		System.out.println("Print set"+hset.add("Sona"));
//		System.out.println("Print set"+hset);
//		

// Integer here put
		HashSet<Integer> hset1 = new HashSet<>(8, (float) 0.50);
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(2);
		hset.add(4);
		hset.add(6);
		hset.add(8);
		hset.add(10);
	
		System.out.println(hset.isEmpty());
		System.out.println(hset.remove(8));
		System.out.println("Value insert in Hashset:"+hset.add(100));
		System.out.println("Value insert in Hashset are:");
		System.out.println("Print set"+hset);
		System.out.println(hset.size());
		System.out.println(hset.hashCode());
		
		System.out.println(hset1.addAll(hset));
		System.out.println("Print hset1"+hset1);
		
		List<Integer> li = new ArrayList<>(hset);
		System.out.println("Hashset to arraylist conversion:"+li);
		
		
		
		}

}
