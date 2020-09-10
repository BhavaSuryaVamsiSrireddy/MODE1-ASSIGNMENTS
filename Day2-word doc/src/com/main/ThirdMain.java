package com.main;

import java.util.Scanner;

import com.logic.ThirdLogic;

public class ThirdMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userString;
		System.out.println("Enter a string ");
		userString = input.nextLine();
		System.out.println("The number of vowels are "+ThirdLogic.countingVowels(userString));

	}

}
