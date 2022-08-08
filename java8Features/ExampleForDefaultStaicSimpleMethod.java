package com.java.java8Features;



public class ExampleForDefaultStaicSimpleMethod implements MyInterfaceSimDefaultStatic
{
	public void simpleMethod(String str)

	{
		System.out.println("This is simple method."+str);
	}
	
	

	public static void main(String[] args) {
		ExampleForDefaultStaicSimpleMethod e = new ExampleForDefaultStaicSimpleMethod();
		e.simpleMethod("Komal");
		e.newMethod();
		MyInterfaceSimDefaultStatic.exitsingMethos("Amruta");
	}

}
