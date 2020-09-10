package com.main;

import java.util.Scanner;

import com.logic.FirstLogic;

public class FirstMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		System.out.println("Enter the first number ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number ");
		secondNumber = input.nextInt();
		System.out.println("Enter the third number ");
		thirdNumber = input.nextInt();
		System.out.println("smallest number among "+firstNumber+","+secondNumber+" and "+thirdNumber+" is "+FirstLogic.findingSmallestNumber(firstNumber, secondNumber, thirdNumber));

	}

}
