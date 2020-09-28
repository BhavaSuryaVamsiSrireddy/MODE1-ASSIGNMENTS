package com.dao;

import com.model.UserDetails;

public interface LoginValidation {
	
	public UserDetails validation(String userId,String password);
	
}
