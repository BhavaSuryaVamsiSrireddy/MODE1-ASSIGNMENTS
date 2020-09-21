package com.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

public class DateTime {
	
	public LocalDate getDate() {
		LocalDate todayDate = LocalDate.now();
		return todayDate;
	}
	
	public LocalTime getTime() {
		LocalTime currentTime = LocalTime.now();
		return currentTime;
	}
	
	public LocalDateTime getDateTime() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		return currentDateTime;
	}
	
	public boolean checkLeap(int year) {
		Year checkYear = Year.of(year);
		if(checkYear.isLeap()) {
			return true;
		}
		return false;
	}

}
