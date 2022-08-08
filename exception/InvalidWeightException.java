package com.exception;

 class WeightException extends Exception {
	 WeightException(String s)
	{
		super(s);
	}
}

 public class InvalidWeightException
{ 
	void weightCheck(int weight) throws WeightException
	{
		if(weight<100)
		{
			throw new WeightException("Product Invalide:");
		}else
		{
			throw new WeightException("Product Valide:");
		}
	}
	
	public static void main(String[] args) {
		InvalidWeightException w = new InvalidWeightException();
		try {
			w.weightCheck(160);
			
		} catch (WeightException e) 
		{
			System.out.println("Caught the exception:");
			System.out.println(e.getMessage());
		}
	}

}
