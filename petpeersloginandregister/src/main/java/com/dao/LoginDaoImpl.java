package com.dao;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	//private static final Logger LOGGER = Logger.getLogger(LoginDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public User getUserDetails(User user) {
		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = " from User where userName =: userName and password =: password";
		User userdb = (User) session.createQuery(SQL_QUERY).setParameter("userName", user.getUserName())
				.setParameter("password", user.getPassword()).uniqueResult();
		if ((userdb != null)) {
			//LOGGER.info("user credentials are validated");
			return userdb;
		}
		//LOGGER.info("no user present with the entered username");
		return null;
	}

}
