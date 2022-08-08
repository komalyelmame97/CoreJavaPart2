package com.java.desingPatten;

import java.util.ArrayList;
import java.util.List;

class User
{
	String name,city;

	public User(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", city=" + city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

class UserService
{
	ArrayList al;
	public UserService()
	{
		al = new ArrayList<>();
		al.add(new User("Komal", "Pune"));
		al.add(new User("Sonali", "Nashik"));
		al.add(new User("Amruta", "Mumbai"));
		al.add(new User("Ankita", "Thane"));
	}
	public ArrayList getUser()
	{
		return al;
	}
}
 class UserDetails implements Cloneable 
{
	private ArrayList list;

	
	
	public UserDetails(ArrayList list) {
		super();
		this.list = list;
	}



	public UserDetails() {
		super();
		this.list = new ArrayList<>();	
	}
	public void getUser()
	{
		UserService us = new UserService();
		this.list = us.getUser();
	}
	public ArrayList<User> getUserList()
	{
		return list;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		List<User> temp = new ArrayList<User>();
        for(User s : this.getUserList()){
            temp.add(s);
        }
        return new UserDetails((ArrayList) temp);

		
	}
	
}
public class PrototypeExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		UserDetails ud = new UserDetails();
		ud.getUser();
		//UserDetails ud1;
		UserDetails ud1 = (UserDetails)ud.clone();
		UserDetails ud2 = (UserDetails)ud.clone();
		
		List list1 = ud1.getUserList();
        list1.add(new User("maya", "Sinner"));
        List list2 = ud2.getUserList();
//        list1.remove(new User("maya", "Sinner"));
        list2.remove(1);

        System.out.println("users old List: " + ud.getUserList());
        System.out.println("New user List: " + list1);
        System.out.println("New User List: " + list2);
        System.out.println("users old List: " + ud.getUserList());

		

	}

}
