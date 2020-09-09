package com.main;

import java.util.Scanner;

import com.operation.ThirdLogic;

public class ThirdMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		System.out.println("Enter the first number ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number ");
		secondNumber = input.nextInt();
		System.out.println("Enter the third number ");
		thirdNumber = input.nextInt();
		
		System.out.println("The average of "+firstNumber+","+secondNumber+" and "+thirdNumber+" is "+ThirdLogic.average(firstNumber, secondNumber, thirdNumber));

	}

}
