package com.operation;

public class EightLogic {

	
	public static int checkSum(int userNumber) {
		int sum=0,remainder;
		while(userNumber>0) {
			remainder = userNumber%10;
			if(remainder%2 == 1) {
				sum += remainder;
			}
			userNumber = userNumber/10;
		}
		if(sum%2==0) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
