package com.interfacedemo;

public class StudentRecord implements CollegeData,HostelData {
	



	@Override
	public void hostelDetail() {
		System.out.println("Hostel Name:SIP");
		System.out.println("Hostel City Name:name");
		
	}

	@Override
	public void studenRecord() {
		System.out.println("student Name:Komal");
		System.out.println("Student City Name:Nashik");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("College Name:Sandip foundation");
		System.out.println("College City Name:Nashik");
		
	}

	@Override
	public void studentData() {
		
		System.out.println("student Degree:Computer");
		System.out.println("Student roll no:11");
		
		
	}
	public static void main(String[] args) {
		StudentRecord s = new StudentRecord();
		s.hostelDetail();
		s.studenRecord();
		s.collegeDetail();
		s.studentData();

	}

}
