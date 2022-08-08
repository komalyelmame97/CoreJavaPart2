package com.java.desingPatten;

public class BehaviouralDesingEx {

	public static void main(String[] args) {
		NameRepositoryContainer nm = new NameRepositoryContainer();
		for(IteratorInterface i=nm.getIterator();i.hashNext();)
		{
			String name = (String) i.next();
			System.out.println("Name" +name);
		}

	}

}
