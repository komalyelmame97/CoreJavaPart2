package com.java.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeRunner {
	public static List<Employee> getEmployeeDetails()
	{
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(11, "Komal", 30000));
		emp.add(new Employee(12, "Ankita", 40000));
		emp.add(new Employee(13, "Shreya", 50000));
		emp.add(new Employee(14, "Maya", 60000));
		return emp;
	}

	public static void main(String[] args) {
		List<Employee> l = getEmployeeDetails();
		
		Predicate<Employee> e1 = e -> e.name.startsWith("p");
		boolean b1 = l.stream().anyMatch(e1);
		System.out.println("Anymatch result: " +b1);

		Predicate<Employee> e2 = e -> e.Salary < 30000;
		boolean b2 = l.stream().noneMatch(e1);
		System.out.println("Nonematch result: " +b2);
		

		Predicate<Employee> e3 = e -> e.Salary < 20000;
		boolean b3 = l.stream().allMatch(e1);
		System.out.println("AllMatch result: " +b3);

	}

}
