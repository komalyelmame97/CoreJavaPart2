package com.java.java8Features;

public class LambdaWithNoParameterExample {

	public static void main(String[] args) {
		MyDaufaltInterface msg = () ->
		{
			return "Hello";
		};
		System.out.println(msg.sayHello());
		
		
	}
}
