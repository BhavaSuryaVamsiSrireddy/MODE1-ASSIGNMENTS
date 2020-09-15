package com.logic;

public class UserMainCode {
	
	public static String reshape(String userString, char character) {
		String result="";
		for(int i=userString.length()-1;i>=0;i--) {
			result = result + userString.charAt(i) + character;
		}
		return result.substring(0, result.length()-1);
	}

}
