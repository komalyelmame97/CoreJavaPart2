package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCharLineCountFile {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D://MyFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String currentLine = br.readLine();
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		while(currentLine !=null)
		{
			linecount++;
			String[] words = currentLine.split(" ");
			wordcount = wordcount + words.length;
			
			for(String word1:words)
			{
				charcount = charcount+word1.length();
			}
			currentLine = br.readLine();
		}
		System.out.println("No of line in the file:"+linecount);
		System.out.println("No of words in the file:"+wordcount);
		System.out.println("No of character in the file:"+charcount);
		br.close();
	}
}
//		int linecount = 0;
//		while(currentLine !=null)
//		{
//			linecount++;
//			currentLine = br.readLine();
//		}
//		System.out.println("Line count:"+linecount);
		
//		int wordcount = 0;
//		while(currentLine !=null)
//		{
//			linecount++;
//			String[] word = currentLine.split(" ");
//			wordcount = wordcount + word.length;
//			currentLine = br.readLine();
//		}
//		System.out.println("Word count:"+wordcount);
//		br.close();
//
//	}
	
//	int charcount = 0;
//	while(currentLine !=null)
//	{
//		linecount++;
//	
//		charcount = charcount+word.length();
//		currentLine = br.readLine();
//}
//}
//}
		
		
		