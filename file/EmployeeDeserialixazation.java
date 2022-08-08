package com.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeDeserialixazation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fo = new FileInputStream("D://MyFile.txt");
		ObjectInputStream obj = new ObjectInputStream(fo);
		Employee e = (Employee) obj.readObject();
		System.out.println("Employee Detail Are:"+  "id:" +e.id + "Name:" +e.name + " City:" +e.city);
		
	}

}
