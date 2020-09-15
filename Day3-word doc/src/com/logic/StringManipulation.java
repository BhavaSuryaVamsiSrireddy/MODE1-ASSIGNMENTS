package com.logic;

public class StringManipulation {

	public static String lowerCase(String userString) {
		return userString.toLowerCase();
	}
	
	public static String replace(String userString, char targetCharacter,char newCharacter) {
		return userString.replace(targetCharacter, newCharacter);
	}
	
	public static String subString(String userString,int startIndex,int endIndex) {
		return userString.substring(startIndex, endIndex);
	}
	
	public static boolean checkPalindrome(String userString) {
		String reversedString = "";
		for(int i=userString.length()-1;i>=0;i--) {
			reversedString += userString.charAt(i);
		}
		if(reversedString.equals(userString)) {
			return true;
		}
		return false;
	}
}
