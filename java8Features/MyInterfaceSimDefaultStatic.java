package com.java.java8Features;

public interface MyInterfaceSimDefaultStatic {

	void simpleMethod(String str);

	//System.out.println("This is simple method."+str);
	
	public default void newMethod()
	{
		System.out.println("Newly added default method.");
	}
	
	static void exitsingMethos(String str)
	{
		System.out.println("Newly added static method.");

	}
}
