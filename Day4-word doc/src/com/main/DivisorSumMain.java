package com.main;

import java.util.Scanner;

import com.logic.AdvancedArithmetic;
import com.logic.MyCalculator;

public class DivisorSumMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter a number ");
		number = input.nextInt();
		AdvancedArithmetic advancedArithmetic = new MyCalculator();
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.println(advancedArithmetic.divisor_sum(number));

	}

}
