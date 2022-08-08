package com.java.desingPatten;

public interface IteratorInterface {
public boolean hashNext();
public Object next();

}

interface Container
{
	public IteratorInterface getIterator();
}

class NameRepositoryContainer implements Container
{
	String name[] = {"komal","Ankita","Pooja"};
	@Override
	public IteratorInterface getIterator() {
		
		return new NameIterator();
	}
	class NameIterator implements IteratorInterface
	{
		int index;

	      @Override
	      public boolean hashNext(){
	      
	         if(index < name.length){
	            return true;
	         }
	         return false;
	      }

		public boolean hashNext1() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}


	}
}
