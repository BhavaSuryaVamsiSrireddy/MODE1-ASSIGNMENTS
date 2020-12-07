package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;
import com.dao.LoginDaoImpl;
import com.model.User;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao loginDao = new LoginDaoImpl();
	public User loginValidate(User user) {
		System.out.println("service"+user.getUserName());
		User dbUser = loginDao.getUserDetails(user);
		if(dbUser!=null) {
			return dbUser;
		}
		return null;
	}

}
