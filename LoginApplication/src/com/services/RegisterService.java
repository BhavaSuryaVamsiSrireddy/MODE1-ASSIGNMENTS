package com.services;

import java.util.ArrayList;

import com.pojo.UserDetails;

public class RegisterService {
	
	public static ArrayList<UserDetails> userDetails = new ArrayList<>(); 
	
	public boolean registerNewUser(UserDetails newUser) {
		boolean result = userDetails.add(newUser); 
		return result;
	}
	
}
