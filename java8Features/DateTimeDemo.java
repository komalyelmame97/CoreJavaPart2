package com.java.java8Features;

import java.time.*;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeDemo d= new DateTimeDemo();
		System.out.println("Date is:" + d);
		LocalDate currentDate = LocalDate.now();
		System.out.println("CurrentDate is:" + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("CurrentTime is:" + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("CurrentDateTime is:" + currentTime);
		
	
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone is:" + currentZone);
		
		System.out.println("CurrentDate is leap  year or not:" + currentDate.isLeapYear());
		System.out.println("Plus Days is:" + currentDate.plusDays(1));
		System.out.println("Plus Month is:" + currentDate.plusMonths(1));
		System.out.println("Plus Week is:" + currentDate.plusWeeks(1));
		System.out.println("Plus Year is:" + currentDate.plusYears(1));
		
		System.out.println("Minus Days is:" + currentDate.minusDays(1));
		System.out.println("Minus Month is:" + currentDate.minusMonths(1));
		System.out.println("Minus Week is:" + currentDate.minusWeeks(0));
		System.out.println("Minus Year is:" + currentDate.minusYears(1));





	}

}
