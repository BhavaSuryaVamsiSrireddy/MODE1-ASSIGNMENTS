package com.logic;

public class Pangram {
	
	public static boolean checkPangram(String userString) {
		int[] alphabetsCount = new int[26];
		int index,asciiValue;
		String upperCaseString = userString.toUpperCase();
		for(int i=0;i<userString.length();i++) {
			asciiValue = (int)upperCaseString.charAt(i);
			if(asciiValue>64 && asciiValue<92) {
				index =  asciiValue - 65;
				alphabetsCount[index] += 1;
			}
		}
		for(int i = 0;i<26;i++) {
			if(alphabetsCount[i]==0) {
				return false;
			}
		}
		return true;
	}

}
