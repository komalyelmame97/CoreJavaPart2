package com.java.desingPatten;

class Girl
{
	String description = "Girl Type";
	public String getDescription()
	{
		return description;
	}
}

class AmericanGirl extends Girl
{
	public AmericanGirl()
	{
		System.out.println("Girl: American");
	}
}

class EuropeanGirl extends Girl
{
	public EuropeanGirl() 
	{
		System.out.println("Girl: European");
	}
}

abstract class GirlDecorator extends Girl
{
	protected Girl girl;
	
	public abstract String getDescription();
	
	
	
}
class Science extends GirlDecorator
{
	private Girl girl;

	public Science(Girl g) {
		
		girl = g;
	}

	@Override
	public String getDescription() {
		return girl.getDescription()+"+Like Science";
	}
	
	public void calculateStuff()
	{
		System.out.println("Science Calculation!");
	}
	
}

class Art extends GirlDecorator
{
	private Girl girl;
	public Art(Girl g)
	{
		girl = g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+"+Like Art";
	}
	
	public void draw()
	{
		System.out.println("Art:GirlDecorator");
	}
}
public class StructureDecoratoeDEx {

	public static void main(String[] args) {
	Girl americanGirl = new AmericanGirl();
	Girl europeanGirl = new EuropeanGirl();
	Art a = new Art(europeanGirl);
	System.out.println("Art Description:" +a.getDescription());
	Science s = new Science(europeanGirl);
	System.out.println("Science Description:" +s.getDescription());

		}

}