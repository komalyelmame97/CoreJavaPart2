package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("Komal");
		li.add(0, "Ankita");
		li.add("Priya");
		li.add(1, "Sona");
		System.out.println("List of element: "+li);
		System.out.println("length of element: "+li.size());
		System.out.println("Get of element: "+li.get(2));
		System.out.println("Set of element: "+li.set(3,"Maya"));
		System.out.println("List of element: "+li);
		System.out.println("Remove of element: "+li.remove(2));
		System.out.println("List of element: "+li);
		System.out.println("Contains of element: "+li.contains("Nikita"));
		li.add("Priya");
		li.add("Ankita");
		System.out.println("List of element: "+li);
		System.out.println("Set of element: "+li.set(4,"Jaya"));
	//System.out.println("Set of element: "+li.set(5,"Kavya"));//array index outof bound so array use
		
		String arr[] = li.toArray(new String[0]);   
		
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
		}
		
	}

}
