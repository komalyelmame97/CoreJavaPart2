package com.java.file;

import java.io.FileWriter;

public class SimpleWrite {

	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("d://abc.txt");
			fw.write("Welcome");
			fw.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
			System.out.println("Success");
			
		}

	}


