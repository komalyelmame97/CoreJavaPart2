package com.java.thread;

class Factorial extends Thread
{
	int factorialNumber = 0;
	public Factorial(int fact)
	{
		this.factorialNumber = fact;
	}
	public void run()
	{
		int j = findFacto(factorialNumber);
		System.out.println("Factorial is:"+j);
	}
	synchronized public int findFacto(int number)
	{
		int i,fact=1;
		for(i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}

class Table extends Thread
{
	int num = 0;
	int j;
	public Table(int num)
	{
		this.num = num;
	}
	public void run() {
		createTable(num);
	}
	private void createTable(int num2) {
		
		
	}
	synchronized public void Table(int number)
	{
		System.out.println("\n\nTable is\n\n:"+j);
		for(int i=1;i<=10;i++)
		{
			System.out.println(number + " * "+ i + " = "+(number * i));
			
		}
	}
	
}


public class SynchronizationThreadFactTableExample {

	public static void main(String[] args) {
		Factorial f = new Factorial(3);
		f.start();
		
		Table t = new Table(5);
		t.start();

	}

}
