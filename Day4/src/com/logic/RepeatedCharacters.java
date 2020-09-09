package com.logic;

public class RepeatedCharacters {

	
	public String findingRepeatedChars(String userString) {
		char[] userStrings = userString.toCharArray();
		String result="";
		for(int i=0;i<userString.length();i++) {
			char character = userStrings[i];
			int count=0;
			String temp = "";
			for(int j=0;j<userString.length();j++) {
				if(character == userStrings[j]) {
					count++;
				}
			}
			temp = character +"-"+count;
			if(result.contains(temp)) {
				continue;
			}
			result = result +" "+ temp;
			result = result.trim();
		}
		return result;
	}
	
	public String findingCharacter(String userString,char character) {
		char[] userStrings = userString.toCharArray();
		int count = 0;
		for(int i=0;i<userStrings.length;i++) {
			if(character == userStrings[i]) {
				count++;
			}
		}
		if(count == 0) {
			return "not found";
		}
		else {
			return character+" "+count;
		}
	}
}
