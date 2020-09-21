package com.service;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public Period getAge(String date) {
		int age=0;
		Integer year = Integer.parseInt(date.substring(0, 4));
		Integer month = Integer.parseInt(date.substring(5, 7));
		Integer dayOfMonth = Integer.parseInt(date.substring(8));
		LocalDate dob = LocalDate.of(year, month, dayOfMonth);
		LocalDate currentDate =  LocalDate.now();
		Period period = Period.between(dob, currentDate);
		return period;
	}

}
