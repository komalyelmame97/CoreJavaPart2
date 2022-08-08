package com.exception;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
		}catch(ArithmeticException e)
		{
			System.out.println(e);	
		}finally {
			System.out.println("Rest of the time:");
			
		}
	}

}
