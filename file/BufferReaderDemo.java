package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("d://MyFile.txt"));
			String line;
			while((line = br.readLine()) !=null)
			{
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
