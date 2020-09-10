package com.logic;

public class ThirdLogic {
	
	public static int countingVowels(String userString) {
		int count = 0;
		userString = userString.toLowerCase();
		for(int i=0;i<userString.length();i++) {
			if(userString.charAt(i)=='a'||userString.charAt(i)=='e'||userString.charAt(i)=='i'||userString.charAt(i)=='o'||userString.charAt(i)=='u') {
				count = count + 1;
			}
		}
		return count;
	}

}
