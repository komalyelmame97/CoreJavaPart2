package com.java.file;

import java.io.FileReader;

public class SimpleReader {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("d://abc.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		
		fr.close();
			
		
	}

}
