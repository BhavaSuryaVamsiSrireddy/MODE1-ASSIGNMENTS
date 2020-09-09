package com.logic;

public class PallindromeLogic {

	
	public static boolean checkingPallindrome(int userNumber) {
		int reversedNumber = ReversingNumberLogic.getReversedNumber(userNumber);
		if(userNumber == reversedNumber) {
			return true;
		}
		return false;
	}
}
