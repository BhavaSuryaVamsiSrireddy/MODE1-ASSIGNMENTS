package com.main;

import java.util.Scanner;

import com.logic.NumberOfWordsInStringLogic;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentance;
		System.out.println("Enter a sentance ");
		sentance = input.nextLine();
		System.out.println("Number of word in a sentance are "+NumberOfWordsInStringLogic.getNumberOfWords(sentance));
	}

}
