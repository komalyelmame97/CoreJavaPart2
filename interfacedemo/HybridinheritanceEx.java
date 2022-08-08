package com.interfacedemo;
interface InterA{
	void displayA();
	
}
interface InterB extends InterA {
	void displayB();
}
interface InterC extends InterA{
	void displayC();
}
class D implements InterB,InterC
{

	@Override
	public void displayA() {
		System.out.println("Display Method A:");
		
	}

	@Override
	public void displayC() {
		System.out.println("Display Method C:");
		
	}

	@Override
	public void displayB() {
		System.out.println("Display Method B:");
	}


		
	
}

public class HybridinheritanceEx {

	public static void main(String[] args) {
		D d = new D();
		d.displayA();
		d.displayB();
		d.displayC();

	}

}
