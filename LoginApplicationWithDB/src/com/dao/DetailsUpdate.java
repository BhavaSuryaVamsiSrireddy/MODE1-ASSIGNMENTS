package com.dao;

public interface DetailsUpdate {
	
	public int userDetailsUpdate(String userId,String field,String updatedValue);
	public int updateAge(String userId,int age);

}
