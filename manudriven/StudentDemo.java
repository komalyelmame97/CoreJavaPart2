package com.java.manudriven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;





class SortByNames implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s1.getStudentName().compareTo(s2.getStudentName());
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, age;
		String name, city;
		ArrayList<Student> studentList = new ArrayList<Student>();
		while (true) {
			System.out.println("Press 1 for add details");
			System.out.println("Press 2 for show details");
			System.out.println("Press 3 search by name");
			System.out.println("Press 4 delete by name");
			System.out.println("Press 5 update age by name");
			System.out.println("Press 6 sort record by name");
			System.out.println("Press 7 for exit");

			System.out.println("Enter a choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Students s = new Students();
				System.out.println("Enter student name:");
				name = sc.next();
				s.setStudentName(name);
				System.out.println("Enter student age:");
				age = sc.nextInt();
				s.setStudentAge(age);
				System.out.println("Enter student city:");
				city = sc.next();
				s.setStudentCity(city);
//				studentList.addAll(s);
				System.out.println("Student Record added successfully");
				System.out.println("------------------------------------------");

				break;

			case 2:
				for (int i = 0; i < studentList.size(); i++) {
					System.out.println("------------------------------------------");

					System.out.println("Student Record:" + (i + 1));
					System.out.println("Student Name: " + studentList.get(i).getStudentName() + "\nStudent Age: "
							+ studentList.get(i).getStudentAge() + "\nStudent City: "
							+ studentList.get(i).getStudentCity());
				}
				System.out.println("------------------------------------------");

				break;

			case 3:
				System.out.println("Enter student name for search ");
				String name1 = sc.next();
				int count = 0;
				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).getStudentName().contains(name1)) {
						System.out.println("Student Record:" + (i + 1));
						System.out.println("Student Name: " + studentList.get(i).getStudentName() + "\nStudent Age: "
								+ studentList.get(i).getStudentAge() + "\nStudent City: "
								+ studentList.get(i).getStudentCity());
						count++;
					}
				}
				if (count == 0) {
					System.out.println("No record found with this name ");

				} else {
					System.out.println("search record by name operation done successfully ");

				}
				System.out.println("------------------------------------------");

				break;
			case 4:
				System.out.println("Enter student name for delete record ");
				String name2 = sc.next();
				int count1 = 0;
				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).getStudentName().contains(name2)) {
						System.out.println("Student Record:" + (i + 1));
						studentList.remove(i);
						count1++;

					}

				}
				if (count1 == 0) {
					System.out.println("No record found with this name ");

				} else {
					System.out.println("delete record by name operation done successfully ");

				}
				System.out.println("------------------------------------------");

				break;

			case 5:
				System.out.println("Enter student name for update age and city in record ");
				String name3 = sc.next();
				int count3 = 0;
				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).getStudentName().contains(name3)) {
						System.out.println("Student Record:" + (i + 1));
						System.out.println("enter age you want to update");
						int age1 = sc.nextInt();
						System.out.println("enter city you want to update");
						String city1 = sc.next();
//						studentList.get(i).setStudentAge(age1);
//						studentList.get(i).setStudentCity(city1);
						count3++;

					}

				}
				if (count3 == 0) {
					System.out.println("No record found with this name ");

				} else {
					System.out.println("updage age and city in record by name operation done successfully ");

				}
				System.out.println("------------------------------------------");

				break;

			case 6:
				for (Student stud : studentList) {
					System.out.println("Student: " + stud + "");
				}

			//	Collections.sort(studentList, new SortByNames());
				System.out.println("Sorted by Names:\n " + studentList);
				System.out.println("------------------------------------------");

				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");

			}

		}

	}

}
