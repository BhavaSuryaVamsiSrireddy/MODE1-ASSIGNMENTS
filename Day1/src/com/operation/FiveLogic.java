package com.operation;

public class FiveLogic {

	public static boolean checkPrime(int userNumber) {
		if(userNumber != 1) {
			for(int i=2;i<=userNumber/2;i++) {
				if(userNumber%i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
