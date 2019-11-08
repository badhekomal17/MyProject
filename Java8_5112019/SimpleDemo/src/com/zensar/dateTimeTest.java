package com.zensar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class dateTimeTest {

	public static void main(String[] args) {
		
		// Current System Date
		LocalDate ld = LocalDate.now();
		System.out.println("Current System Date:- " +ld);
		
		LocalDate newld = ld.plusDays(4);
		System.out.println("Current Date after 4 days:- " +newld);
		
		// Here of() is factory Method
		// Particular year-month-date
		LocalDate date=LocalDate.of(1999, Month.OCTOBER, 17);
		System.out.println(date);
		
		// Current System Time
		LocalTime lt = LocalTime.now();
		System.out.println("Current system time:- " +lt);
		
		// Diffrence betwwen 2 date
		LocalDate date1 = LocalDate.of(1986, 10, 11);
		
		LocalDate todaysDate = LocalDate.now();
		
		Period between = Period.between(date1, todaysDate);
		
		System.out.println("Diffrence between 2 dates:- " +between.getYears()+ ":" +between.getMonths()+ ":" +between.getDays());;

	}

}
