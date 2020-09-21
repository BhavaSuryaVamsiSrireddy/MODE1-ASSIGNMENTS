package com.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import com.service.DateTime;

public class DateTimePractice {

	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag = true;
		while(flag) {
			System.out.println("1.To get date\n2.To get time\n3.To get date and time\n4.To check year is leap or not\5.To exit");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				LocalDate date = dateTime.getDate();
				System.out.printf("%d-%d-%d",date.getYear(),date.getMonthValue(),date.getDayOfMonth());
				break;
			case 2:
				LocalTime time = dateTime.getTime();
				System.out.printf("%d-%d-%d-%d",time.getHour(),time.getMinute(),time.getSecond(),time.getNano());
				break;
			case 3:
				LocalDateTime datetime = dateTime.getDateTime();
				System.out.printf("date = %d-%d-%d & time = %d-%d-%d-%d",datetime.getYear(),datetime.getMonthValue(),datetime.getDayOfMonth(),datetime.getHour(),datetime.getMinute(),datetime.getSecond(),datetime.getNano());
				break;
			case 4:
				System.out.println("Enter a year to check it is leap year or not");
				int year = input.nextInt();
				if(dateTime.checkLeap(year)) {
					System.out.println("It is a leap year");
				}
				else {
					System.out.println("It is not a leap year");
				}
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("please enter a valid option");
			}
		}
	}

}
