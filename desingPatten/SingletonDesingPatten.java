package com.java.desingPatten;


class Database
{
	private static Database dbobj;
	private Database()
	{
		
	}
	
	public static Database getInstance() 
	{
		if(dbobj == null)
		{
			dbobj = new Database();
		}
		return dbobj;
	}
	
	public void getconnetion()
	{
		System.out.println("You are now connected to the database.");
	}
}
	
public class SingletonDesingPatten {

	public static void main(String[] args) {
		Database db1;
		db1 = Database.getInstance();
		db1.getconnetion();

	}

}
