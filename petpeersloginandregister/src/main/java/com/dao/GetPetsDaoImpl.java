package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Pets;
import com.model.User;

@Repository
public class GetPetsDaoImpl implements GetPetsDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Pets> getPetsFromDb() {
		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = "from Pets";
		List<Pets> pets = session.createQuery(SQL_QUERY).list();
		System.out.println(pets);
		if ((pets != null)) {
			//LOGGER.info("user credentials are validated");
			return pets;
		}
		//LOGGER.info("no user present with the entered username");
		return null;
	}

}
