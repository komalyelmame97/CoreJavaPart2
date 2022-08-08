package com.exception;

public class NumberFormate {

	public static void main(String[] args) {
		try {
			String str  = "123";
			int i = Integer.parseInt(str);
			System.out.println("String Fotmat:"+i);	

		}catch (Exception e) {
			System.out.println(e);	
		}

	}

}
