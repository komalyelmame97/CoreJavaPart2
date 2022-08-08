package com.java.file;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("D://MyFile.txt");
		ObjectOutputStream obj = new ObjectOutputStream(f);
		Employee e = new Employee();
		e.id = 1;
		e.name = "xyz";
		e.city = "Nashik";
		obj.writeObject(e);
		System.out.println("data is save:");
	}

}
