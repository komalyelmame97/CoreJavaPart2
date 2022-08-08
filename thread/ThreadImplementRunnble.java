package com.java.thread;

class Thread11 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread11 is running:");
		
	}

}
class Thread22 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread22 is running:");
		
	}
	
}



public class ThreadImplementRunnble {

	public static void main(String[] args) {
		Thread11 t1 = new Thread11();
		Thread t = new Thread(t1);
		t.start();
		Thread22 t2 = new Thread22();
		Thread th = new Thread(t2);
		th.start();

	}

}
