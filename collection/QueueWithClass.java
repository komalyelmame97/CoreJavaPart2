package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Emp implements Comparable<Emp>
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Emp e) {
		if(id>e.id)
			return 1;
		else if(id<e.id)
			return -1;
		else
			return 0;
		
	}
}
public class QueueWithClass {

	public static void main(String[] args) {
		ArrayList<Emp> q = new ArrayList();
		//Queue<Emp> q = new PriorityQueue<Emp>();
		
		Emp e1 = new Emp(1,"Komal");
		Emp e2 = new Emp(10,"Priya");
		Emp e3 = new Emp(100,"Ankita");
		q.add(e1);
		q.add(e2);
		q.add(e3);
		
		Collections.sort(q);
		System.out.println(q);
		for(Emp em : q)
		{
			System.out.println(em.id);
			System.out.println(em.name);
		}
		

	}

}
