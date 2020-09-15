package com.main;

import java.util.Scanner;

import com.logic.UserMainCode;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userString;
		char character;
		System.out.println("Enter a String ");
		userString = input.next();
		System.out.println("Enter a character ");
		character = input.next().charAt(0);
		System.out.println(UserMainCode.reshape(userString, character));
	}

}
