package com.main;

import java.util.Scanner;

import com.operation.FourthLogic;

public class FourthMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FourthLogic fourthLogic = new FourthLogic();
		int firstNumber,secondNumber;
		System.out.println("Enter the first number ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number ");
		secondNumber = input.nextInt();
		
		fourthLogic.setFirstNumber(firstNumber);
		fourthLogic.setSecondNumber(secondNumber);
		System.out.println("numbers before swapping "+fourthLogic.getFirstNumber()+" and "+fourthLogic.getSecondNumber());
		
		fourthLogic.swap();
		
		System.out.println("numbers after swapping "+fourthLogic.getFirstNumber()+" and "+fourthLogic.getSecondNumber());
		
		
	}

}
