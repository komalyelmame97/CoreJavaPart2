package com.java.desingPatten;
interface Car
{
	public void build();
}

class BMW implements Car
{
	public void build()
	{
		System.out.println("A BMW car build.");
	}
}

class Chevrolet implements Car
{
	public void build()
	{
		System.out.println("A Chevrolet car build.");
	}
}

class Renault implements Car
{
	public void build()
	{
		System.out.println("A Renault car build.");
	}
}

class FacadeForCar
{
	private Car bmw;
	private Car chevrolet;
    private Car renault;
	public FacadeForCar()
	{ 
		super();
		this.bmw = new BMW();
		this.chevrolet = new Chevrolet();
        this.renault = new Renault();
		
	}
	
	public void buildBMW()
	{
		bmw.build();
	}
	
	public void buildChevrolet()
	{
		chevrolet.build();
	}
	
	public void buildRenault()
	{
		renault.build();
	}
  
}
public class FacadeDesingPattenEx {

	public static void main(String[] args) {
		FacadeForCar f = new FacadeForCar();
		
		f.buildBMW();
        f.buildChevrolet();
        f.buildRenault();
	}

}
