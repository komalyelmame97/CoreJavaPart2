package com.java.thread;
class ATMCenter
{
	static synchronized void userAction()
	{
		System.out.println(Thread.currentThread().getName() + " enter .");
		System.out.println(" Perform Transaction ");
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println(Thread.currentThread().getName() + " Transaction Complited .");
		System.out.println(Thread.currentThread().getName() + " leaving.... .");
		System.out.println("...................................................");
	}

			
}

class AccountHolder extends Thread
{
	public void run()
	{
		ATMCenter.userAction();
	}
}
public class ATMTrasactionSaticSy {

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++)
		{
			AccountHolder t = new AccountHolder();
			t.setName(" Person " +i);
			t.start();
	    }
	}

}
