package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Pets;

@Repository
public class BuyPetDaoImpl implements BuyPetDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public String buyPetDb(int petId, int userId) {
		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = "update Pets set userId=:userId where petId=:petId";
		int rows = session.createQuery(SQL_QUERY).setParameter("userId", userId).setParameter("petId", petId).executeUpdate();
		if ((rows != 0)) {
			//LOGGER.info("user credentials are validated");
			return "success";
		}
		//LOGGER.info("no user present with the entered username");
		return "success";
	}

}
