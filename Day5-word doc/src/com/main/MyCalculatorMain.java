package com.main;

import java.util.Scanner;

import com.exceptionprograms.MyCalculator;
import com.exceptionprograms.NotNegative;
import com.exceptionprograms.NotZero;

public class MyCalculatorMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number,power;
		MyCalculator myCalculator = new MyCalculator();
		System.out.println("Enter a number ");
		number = input.nextInt();
		System.out.println("Enter a power ");
		power = input.nextInt();
		try {
			System.out.println(myCalculator.power(number, power));
		}
		catch(Exception exception) {
			System.out.println(exception);
		}

	}

}
