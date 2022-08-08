package com.exception;

public class VotingEx {
	 static void validate(int age)
	{
		if(age<20)
		{
			throw new ArithmeticException("Not valid:");
		}
		else
		{
			System.out.println("Welcome to vote:");
		}
	}

	public static void main(String[] args) {
		validate(22);
		System.out.println("Rest of the code:");
	}

}
