package com.java.manudriven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> studentArray = new ArrayList<Student>();
		int choice,age;
		String name ,city;
		Scanner scanner = new Scanner(System.in);
		//Creating while loop
		
		while(true) {
			System.out.println("Press 1 for Add Student Detail");
			System.out.println("Press 2 for Show Student Detail");
			System.out.println("Press 3 for Search Student by name");
			System.out.println("Press 4 for Delete User by name");
			System.out.println("Press 5 for Sort User by name");
			System.out.println("Press 6 for Update age");
			System.out.println("Press 7 for Tree set");
			System.out.println("Press 8 to Quit\n \n ");
			System.out.println("---------------------------------------------");
			
			
			System.out.println("Make your Choice");
			choice = scanner.nextInt();
			
			switch(choice) 
			{
				case 1 :
				System.out.print("Enter the student name:  ");
				name = scanner.next();
				System.out.print("Enter the student age:  ");
				age = scanner.nextInt();
				System.out.print("Enter the student city:  ");
				city = scanner.next();
				Student s = new Student();
				s.setName(name);
				s.setAge(age);
				s.setCity(city);
				studentArray.add(s);
				System.out.println("Student Record has been added");
				System.out.println("---------------------------------------------");
				break;
				
				case 2 :
					for(int i=0;i<studentArray.size();i++)
					{	
						
					System.out.println("Student Record:"+(i+1));
					System.out.println("Student Name: "+studentArray.get(i).getName());
					System.out.println("Student Age: "+studentArray.get(i).getAge());
					System.out.println("Student City: "+studentArray.get(i).getCity());
					System.out.println("---------------------------------------------");
					}
					break;
					
				case 3:
					System.out.println("Enter the student name for search:");
					String name1 = scanner.next();
					int count = 0;
					for(int i=0;i<studentArray.size();i++)
					{
						if(studentArray.get(i).getName().contains(name1))
						{
							System.out.println("Student Record:"  + (++count));
							System.out.println("Student Name:"+studentArray.get(i).getName());
							System.out.println("Student Age:"+studentArray.get(i).getAge());
							System.out.println("Student City:"+studentArray.get(i).getCity());
							System.out.println("---------------------------------------------");
						}
					}
					if(count == 0)
					{
						System.out.println("No record Found for that search");
					}
					break;
					
				case 4:
					System.out.println("Enter the student name for Delete:");
					String name2 = scanner.next();
					int count1 = 0;
					
					for(int i=0;i<studentArray.size();i++)
					{
						if(studentArray.get(i).getName().contains(name2))
						{
							System.out.println("Student Record:"  + (++count1));
							studentArray.remove(i);
						}
					}
					if(count1 == 0)
					{
						System.out.println("No record Found for delete record");
					}
					else
					{
						System.out.println("Student Record has been deleted successfully");
					}
					System.out.println("---------------------------------------------");
					break;
					
				case 5:
					extracted(studentArray);
					
					for(Student str: studentArray)
					{
						System.out.println(str.getName()+"  "+str.getAge()+"  "+str.getCity());
					}
					System.out.println("---------------------------------------------");
					break;
				
				case 6:
					System.out.println("Enter the student name for Update age and city in record:");
					 String name3 = scanner.next();
					int count2 = 0;
					
					for(int i=0;i<studentArray.size();i++)
					{
						if(studentArray.get(i).getName().contains(name3))
						{
							System.out.println("Student Record:"  + (i+1));
							System.out.println("Enter age you want to upadate:"+studentArray.get(i).getAge());
							int age1 = scanner.nextInt();
							System.out.println("Enter city you want to upadate:"+studentArray.get(i).getCity());
							String city1 = scanner.next();
							count2++;
						}
					}
					if(count2 == 0)
					{
						System.out.println("No record Found for with this name");
					}
					else
					{
						System.out.println("Update age and city Record done successfully");
					}
					System.out.println("---------------------------------------------");
					break;
				
				case 7:
					TreeSet<Student> treeset = new TreeSet<Student>(Student.stuNameComparator);
					for(Student st: studentArray)
					{
						treeset.add(st);					
						
					}
					for(Student st: treeset)
					{
						System.out.println("Name"+st.getName());
						System.out.println("city"+st.getCity());
						System.out.println("Age"+st.age);
					}
					break;
					
				case 8:
					System.exit(0);
					
					
				default :
					System.out.println("Invalid choice!!!!!Please make a valid choice.\\n\\n");		
					
					
			}
		}
	}

	private static void extracted(ArrayList<Student> studentArray) {
		Collections.sort(studentArray, Student.stuNameComparator);
	}

}
