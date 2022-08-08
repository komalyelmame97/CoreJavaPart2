package com.java.java8Features;

public class LabadaWithPrameterExample {

	public static void main(String[] args) {
		MyParameterInterfaceLamada msg = (name) ->
		{
			return "Hello," +name;
		};
		System.out.println(msg.sayHello("komal"));
		
		MyParameterInterfaceLamada msg1 = (name) ->
		{
			return "Hi," +name;
		};
		System.out.println(msg1.sayHello("I am komal"));
	}

	}


