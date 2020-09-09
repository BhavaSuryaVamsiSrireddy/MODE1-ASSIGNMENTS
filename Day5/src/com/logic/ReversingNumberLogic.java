package com.logic;

public class ReversingNumberLogic {

	public static int getReversedNumber(int userNumber) {
		int reversedNumber=0;
		while(userNumber>0) {
			reversedNumber =(reversedNumber * 10)+ (userNumber%10);
			userNumber = userNumber/10;
		}
		return reversedNumber;
	}
}
