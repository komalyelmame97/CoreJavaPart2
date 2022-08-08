package com.java.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Koaml");
		pq.add("Pooja");
		pq.add("Ankita");
		pq.add("Amruta");
		pq.add("Koaml");
		System.out.println("Priority Element are:"+pq);
		System.out.println(pq.peek());
		System.out.println("Remove:"+pq.poll());
		System.out.println("Priority Element are:"+pq);
	}

}
