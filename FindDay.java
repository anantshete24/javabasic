package com.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FindDay {
			 
			
			
	public static String findday(String date)
	{
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		LocalDate localDate=LocalDate.parse(date, formatter);
		DayOfWeek dayOfWeek=localDate.getDayOfWeek();
		return dayOfWeek.name();
	}
	public static void main(String[] args) {


		String date="1984-01-17";
		System.out.println(findday(date));
		
	}

}
