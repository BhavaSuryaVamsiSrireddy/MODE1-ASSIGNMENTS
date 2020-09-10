package com.logic;

public class Addition {
	
	public static void addition(int[] numbers) {
		String result;
		int sum;
		for(int i = 0; i<numbers.length-1;i++) {
			result = "";
			sum = 0;
			for(int j=0;j<=i+1;j++) {
				sum += numbers[j];
				result = result + numbers[j] +"+" ;
			}
			result = result.substring(0, result.length()-1)+" = "+sum;
			System.out.println(result);
		}
	}

}
