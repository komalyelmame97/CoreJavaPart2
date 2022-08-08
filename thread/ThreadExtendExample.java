package com.java.thread;

class Thread1 extends Thread
{
	public void run() {
		System.out.println("Thread1 is running:");
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread2 is running:");
	}
}


public class ThreadExtendExample {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();


	}

}
