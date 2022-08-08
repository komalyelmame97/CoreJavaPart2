package com.java.thread;
class Multiplication implements Runnable
{

	@Override
	public void run() {
		int num = 4;
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+"*" +i+ "=" +num*i);
		}
		
	}
	
}
class Fibonacci implements Runnable
{

	@Override
	public void run() {
	int num=12;
	int f1=0,f2=1,f3;
	
	for(int i=1;i<=num;i++)	
	{
		f3=f1+f2;
		System.out.println(+f3);
		f1=f2;
		f2=f3;
	}
	}
	
}
class EvenOdd implements Runnable
{

	@Override
	public void run() {
		int n = 4;
		if(n%2 == 0)
		{
			System.out.println("No is Even:"+n);
			
		}else {
			System.out.println("No is Odd:");
		}
		System.out.println("EvenOdd Runnable:");
	}
	
}
public class ThreadMulOperationExampleUsingRunnable {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		Thread t = new Thread(m);
		t.start();
		Fibonacci f = new Fibonacci();
		Thread tt = new Thread(f);
		tt.start();
		EvenOdd e = new EvenOdd();
		Thread ttt = new Thread(e);
		ttt.start();
	}

}
