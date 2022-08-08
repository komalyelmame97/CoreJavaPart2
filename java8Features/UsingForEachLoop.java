package com.java.java8Features;

import java.util.ArrayList;
import java.util.List;

public class UsingForEachLoop 
{
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Amruta");
		al.add("Ankita");
		al.add("Shubha");
		al.add("Sonali");
		
		long count = 0;
		for(String str : al)
		{
			if(str.length()< 6)
				count++;
		}
		System.out.println("Count Name Length is<6:" +count);
//using stream api
//		count = al.stream().filter(str -> str.length()<6).count();
//		
//		System.out.println("Ther are strings with length less than 6 :" +count);
//
//	}
	}
}
	
