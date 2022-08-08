package com.exception;
class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}	
public class TestCustomException {

	
		 static void validate(int age) throws InvalidAgeException
			{
				if(age<18)
				{
					throw new InvalidAgeException("Not valid:");
				}
				else
				{
					System.out.println("Welcome to vote:");
				}
			}

			public static void main(String[] args) {
				try
				{
					validate(22);	
				}catch(Exception m)
				{
					System.out.println("Exception Occures:"+m);
				}
				
				System.out.println("Rest of the code:");
			}

	}


