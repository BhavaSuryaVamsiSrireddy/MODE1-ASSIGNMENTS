package com.operation;

public class NineLogic {

	public static int sumOfSquaresOfEvenDigits(int userNumber) {
		int sum=0,remainder;
		while(userNumber>0) {
			remainder = userNumber%10;
			if(remainder%2 == 0) {
				sum += (remainder*remainder);
			}
			userNumber = userNumber/10;
		}
		return sum;
	}
}
