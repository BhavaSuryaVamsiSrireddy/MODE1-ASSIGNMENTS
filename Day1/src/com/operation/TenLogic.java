package com.operation;

public class TenLogic {
	
	public static String getLargestWord(String sentance) {
		String[] words = sentance.split(" ");
		String longestWord = words[0];
		for(int i=1;i<words.length;i++) {
			if(words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}
		}
		return longestWord;
	}
}
