package com.logic;

public class SecondLogic {
	
	public static String findingMiddleCharacter(String userString) {
		int userStringLength = userString.length();
		if(userStringLength%2==0) {
			return userString.substring(userStringLength/2-1, userStringLength/2+1);
		}
		else {
			return userString.charAt(userStringLength/2)+"";
		}
	}
}
