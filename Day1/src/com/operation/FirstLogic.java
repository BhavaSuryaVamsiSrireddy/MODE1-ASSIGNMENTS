package com.operation;

public class FirstLogic {

	
	public static void evaluate() {
		int result;
		result = -5 + 8 * 6;
		System.out.println("-5 + 8 * 6 = "+result);
		result = (55+9) % 9;
		System.out.println("(55+9) % 9 = "+result);
		result = 20 + -3*5 / 8;
		System.out.println("20 + -3*5 / 8 = "+result);
		result = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("5 + 15 / 3 * 2 - 8 % 3 = "+result);
	}
}
