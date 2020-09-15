package com.exceptionprograms;

public class MyCalculator {
	
	public long power(int number,int power) throws NotZero, NotNegative {
		if(number==0&&power==0) {
			throw new NotZero("java.lang.Exception: number and power should not be zero.");
		}
		if(number<0||power<0) {
			throw new NotNegative("java.lang.Exception: number or power should not be negative.");
		}
		long result = 1l;
		for(int i = 0;i<power;i++) {
			result = result * number;
		}
		return result;
	}
	
}
