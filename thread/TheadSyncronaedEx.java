package com.java.thread;

class First
{
	synchronized public void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	System.out.println("]");
	}
}

class Second extends Thread
{
	String msg;
	First obj;
	Second (First fp,String str)
	{
		obj = fp;
		msg = str;
		//start();
	}
	public void run()
	{
		obj.display(msg);
	}
}
public class TheadSyncronaedEx {

	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "Welcome");
		ss.start();
		Second ss1 = new Second(fnew, "to");
		ss1.start();
		Second ss2 = new Second(fnew, "this example");
		ss2.start();
		

	}

}
