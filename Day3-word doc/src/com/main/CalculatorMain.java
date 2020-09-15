package com.main;

import java.util.Scanner;

import com.hcl.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber,secondNumber;
		System.out.println("Enter first number");
		firstNumber = input.nextInt();
		System.out.println("Enter second number");
		secondNumber = input.nextInt();
		Calculator calculator = new Calculator();
		System.out.println("Addition of two numbers is "+calculator.add(firstNumber,secondNumber));
	}

}
