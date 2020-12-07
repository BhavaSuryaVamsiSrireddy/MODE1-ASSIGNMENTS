package com.dao;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	//private static final Logger LOGGER = Logger.getLogger(RegisterDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public String getNewUserDetails(User user) {
		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = " from User where userName =: userName";
		User userdb = (User) session.createQuery(SQL_QUERY).setParameter("userName", user.getUserName()).uniqueResult();
		if ((userdb == null)) {
			session.save(user);
			//LOGGER.info("new user is stored in the databse successfully");
			return "success";
		}
		//LOGGER.info("new user is failed to store in the databse");
		return "failed";
	}

}
