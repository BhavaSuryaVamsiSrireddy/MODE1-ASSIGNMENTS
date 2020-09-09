package com.main;

import java.util.Scanner;

import com.operation.SixLogic;

public class SixMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Character userCharacter;
		System.out.println("Enter a character to get ASCII value ");
		userCharacter = input.next().charAt(0);
		System.out.println("The ASCII value of "+userCharacter+" is "+SixLogic.getAsciiValue(userCharacter));
		
	}

}
