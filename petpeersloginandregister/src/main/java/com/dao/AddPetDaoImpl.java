package com.dao;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Pets;
import com.model.User;
@Repository
public class AddPetDaoImpl implements AddPetDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public String getNewPetDetails(Pets pet,int userId) {
		String id = null;
		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = " from Pets where userId =: userId and petName =: petName";
		Pets petdb = (Pets) session.createQuery(SQL_QUERY).setParameter("userId", userId).setParameter("petName", pet.getPetName()).uniqueResult();
		if (petdb == null) {
			System.out.println("add pet");
			session.save(pet);
		}
		else {
			String UPDATE_QUERY = "update Pets set userId=:id where userId=:userId and petName=:petName";
			session.createQuery(UPDATE_QUERY).setParameter("id", id).setParameter("userId", userId).setParameter("petName", pet.getPetName()).executeUpdate();
		}
		return "success";
	}

}
