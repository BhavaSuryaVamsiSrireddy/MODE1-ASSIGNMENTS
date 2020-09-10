package com.main;

import java.util.Scanner;

import com.logic.SecondLogic;

public class SecondMain {

	public static void main(String[] args) {
		
		String userString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string ");
		userString = input.next();
		System.out.println("middle character of "+userString+" is "+SecondLogic.findingMiddleCharacter(userString));

	}

}
