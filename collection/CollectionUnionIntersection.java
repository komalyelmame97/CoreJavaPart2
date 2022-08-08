package com.java.collection;

import java.util.HashSet;

public class CollectionUnionIntersection {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<Integer>(8, (float) 0.50);
		
		hset.add(2);
		hset.add(4);
		hset.add(6);
		hset.add(8);
		hset.add(10);
		
		HashSet<Integer> hset1 = new HashSet<>(8, (float) 0.50);
		hset1.add(10);
		hset1.add(20);
		hset1.add(30);
		hset1.add(40);
		hset1.add(150);
		hset.addAll(hset1);
		System.out.println("Union:"+hset);
		hset.retainAll(hset1);
		System.out.println("Intersection :"+hset);
		hset.removeAll(hset1);
		System.out.println("Diffrence is:"+hset1);
		

	}

}
