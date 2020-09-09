package com.services;

import java.util.ArrayList;

import com.pojo.UserDetails;

public class LoginService {
	
	public UserDetails validate(String userName,String password) {
		for(UserDetails user:RegisterService.userDetails) {
			if( user.getUserName().equals(userName) && user.getPassword().equals(password) ) {
				return user;
			}
		}
		
		return null;
	}
}
