package com.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(2);
		tset.add(4);
		tset.add(6);
		tset.add(8);
		tset.add(10);
		//tset.add(null);
		System.out.println("Tree set element are:"+tset);

	}

}
