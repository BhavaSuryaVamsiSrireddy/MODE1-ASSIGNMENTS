package com.main;

import java.util.Scanner;

import com.exceptionprograms.AgeValidation;
import com.exceptionprograms.InvalidAgeRangeException;
import com.pojo.CricketersDetails;

public class AgeValidationMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cricketerAge;
		String cricketerName;
		CricketersDetails cricketersDetails = new CricketersDetails();
		System.out.println("Enter name of a cricketer ");
		cricketerName = input.next();
		cricketersDetails.setCricketerName(cricketerName);
		System.out.println("Enter age of a cricketer ");
		cricketerAge = input.nextInt();
		cricketersDetails.setCricketerAge(cricketerAge);
		AgeValidation ageValidation = new AgeValidation();
		try {
			if(ageValidation.checkingAge(cricketersDetails.getCricketerAge())) {
				System.out.println("Player Name : "+cricketersDetails.getCricketerName());
				System.out.println("Player Age : "+cricketersDetails.getCricketerAge());
			}
		} catch (InvalidAgeRangeException e) {
			System.out.println(e);
		}

	}

}
