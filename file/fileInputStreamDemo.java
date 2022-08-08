package com.java.file;

import java.io.FileInputStream;

public class fileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d://abc.txt");
			int i = 0;
			while ((i - fin.read()) != -1) 
			{
				System.out.println((char)i);
				
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Reading of file is successful");
		
	}

}
