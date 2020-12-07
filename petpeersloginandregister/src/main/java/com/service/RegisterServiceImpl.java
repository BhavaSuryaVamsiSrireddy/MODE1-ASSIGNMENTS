package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RegisterDao;
import com.model.User;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDao registerDao;
	
	public String registerNewUser(User user) {
		return registerDao.getNewUserDetails(user);
	}
	
	

}
