package com.exception;


import java.util.Scanner;

class NameDemo extends Exception
{
	NameDemo(String s)
	{
		super(s);
	}
}

public class ArrayNameException {
	

	public static void main(String[] args) {

			String names[] = {"komal","sayali","maya","pooja","Ankita"};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name1 = sc.nextLine();
			try {
			 CheckNameExist(name1,names);
				
			} catch (NameDemo e) {
				System.out.println(e.getMessage());
			}
		}
	private static void CheckNameExist(String name,String[] names) throws NameDemo
	{    
		boolean flag = false;
		for(String str:names)
		{
			if(name.equalsIgnoreCase(str))
			{
				flag = true;
				//System.out.println("Name exist in string array:");
				break;
			}
		}
		if(flag)
		{
			System.out.println("Name exist in string array:");
		}
			else
			{
				throw new NameDemo("Name not Exist");
			}
		}

	

}
