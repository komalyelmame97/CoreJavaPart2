package com.java.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SimplePrintWriter {

	public static void main(String[] args) {
		
			try 
			{ 
			File f = new File("d://MyFile.txt");
				
			if(f.exists())
			{
				f.createNewFile();
			} 
			
			PrintWriter pw = new PrintWriter(f);
			pw.println();
			pw.println("My name is komal");
			pw.close();
			System.out.println("Done");
			}catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}  

	
	

}
