package com.logic;

public class NumberOfWordsInStringLogic {
	
	public static int getNumberOfWords(String sentance) {
		String[] words = sentance.split(" ");
		return words.length;
	}
}
