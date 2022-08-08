package com.exception;

public class ArrayIndexException {

	public static void main(String[] args) {
		try {
			int a[] = new int [5];
			a[7] = 20;
			System.out.println("My array element:"+a[2]);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
