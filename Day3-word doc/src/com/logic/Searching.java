package com.logic;

public class Searching {
	
	public static boolean search(int[] numbers,int searchNumber) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==searchNumber) {
				return true;
			}
		}
		return false;
	}

}
