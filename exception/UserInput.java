package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name:");
		String name = br.readLine();
		System.out.println("Name:"+name);
		
		System.out.println("Enter Your RollNumber:");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Rollno:"+rollno);

	}

}
