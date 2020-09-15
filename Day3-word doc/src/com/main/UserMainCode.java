package com.main;


import java.util.Scanner;

public class UserMainCode {
	
	public static String getString(String userString) {
		if(userString.charAt(0)=='k'&&userString.charAt(1)=='b') {
			return userString;
		}
		else if(userString.charAt(0)=='k') {
			return userString.charAt(0)+userString.substring(2);
		}
		else if(userString.charAt(1)=='b'){
			return userString.substring(1);
		}
		else {
			return userString.substring(2);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userString;
		System.out.println("Enter a string ");
		userString = input.next();
		System.out.println(getString(userString));

	}

}
