package com.java.file;

import java.io.Serializable;

public class Employee implements Serializable {
//public int id = 1;
//public String name;
//public String city;
//public static void main(String[] args) {
	
	//Getter setter method use
	public int id = 1;
	public String name;
	public String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	}


