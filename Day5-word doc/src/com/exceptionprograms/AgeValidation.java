package com.exceptionprograms;

public class AgeValidation {
	
	public boolean checkingAge(int cricketerAge) throws InvalidAgeRangeException {
		if(cricketerAge<19) {
			throw new InvalidAgeRangeException("CustomException: InvalidAgeRangeException");
		}
		return true;
	}

}
