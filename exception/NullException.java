package com.exception;

public class NullException {

	public static void main(String[] args) {
		try {
			String str  = "komal";
			System.out.println("String length:"+str.length());	

		}catch (Exception e) {
			System.out.println(e);	
		}
	}

}
