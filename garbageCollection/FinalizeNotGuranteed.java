package com.java.garbageCollection;

public class FinalizeNotGuranteed implements Runnable
{
	private void getMyMethod() throws InterruptedException {

		try {
			System.out.println("Hi, I am TRY");
			throw new NullPointerException();

		} catch (NullPointerException e) {
			System.out.println("Hi, Iam CATCH");

		} finally {
			System.out.println("Hi, I am FINALLY");
		}
		System.gc();
	}
	


	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am inside finalize block");
		super.finalize();
	}


	@Override
	public void run() {
		try {
			getMyMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
//start the thread method run by using start method
			new Thread(new FinalizeNotGuranteed()).start();
		}
	}

//	

}
