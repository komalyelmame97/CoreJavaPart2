package com.exception;

public class ExceptionOperation {

	public static void main(String[] args) {
		try
		{
			int a[] = new int [5];
			a[9] = 20;
			System.out.println("My array element:"+a[9]);
			
			
			int k = 5;
			int b = 2;
			int c = k/b;
			String str = "Komal";
			System.out.println("String length:"+str.length());	
			
		}catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException"+ae);	
		}
		catch (Exception e) {
			System.out.println("Exception");	
		}
		finally {
			System.out.println("end");	
		}
		}

	}


