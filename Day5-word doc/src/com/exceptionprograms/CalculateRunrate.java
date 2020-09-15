package com.exceptionprograms;



public class CalculateRunrate {
	
	public void getRunrate(int totalRunsScored,int totalOversFaced) {
		try {
			System.out.println("Current Run Rate : "+totalRunsScored/totalOversFaced);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
}
