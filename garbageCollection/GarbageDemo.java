package com.java.garbageCollection;

public class GarbageDemo {

	public static void main(String[] args) {
		GarbageDemo gd = new GarbageDemo();
		gd = null;
		String str = new String("Hello");
		str = null;
		
		System.gc();
		System.out.println("main method");
	}
	protected void finalize()
	{
		System.out.println("\n\nOverriding  now.");
	}

}
