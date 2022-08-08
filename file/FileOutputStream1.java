package com.java.file;
import java.io.FileOutputStream;
public class FileOutputStream1 {

	public static void main(String[] args) {
		try {
			
			FileOutputStream1 fout = new FileOutputStream1();
			fout.write(97);
			fout.write(98);
			fout.write(99);
			fout.write(100);
			fout.write(101);
			fout.write(102);
			fout.clone();
			System.out.println("Writing into file is successfuly");
		} 
		catch (Exception e) {
			
			System.out.println(e);
		}

	}

	private void write(int i) {
		// TODO Auto-generated method stub
		
	}

}
