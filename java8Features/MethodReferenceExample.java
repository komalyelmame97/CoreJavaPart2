package com.java.java8Features;

public class MethodReferenceExample 
{
	public void myMethod()
	{
		System.out.println("Instance Method");
	}
	
	public static void myMethod1()
	{
		System.out.println("Static Method1");

	}
	public static void main(String[] args) {
		MethodReferenceExample obj = new MethodReferenceExample();
		obj.myMethod();
//method reference
		MyRefrenceInterface ref = obj :: myMethod;
		// calling method fun interface
		ref.display();
		
		MyRefrenceInterface ref1 = MethodReferenceExample :: myMethod1;
		 ref1.display();
		
	}

}
