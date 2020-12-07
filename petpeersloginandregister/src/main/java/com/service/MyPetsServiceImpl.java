package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyPetsDao;
import com.model.Pets;

@Service
public class MyPetsServiceImpl implements MyPetsService{

	@Autowired
	MyPetsDao myPetsDao;
	public List<Pets> getMyPets(int userId) {
		return myPetsDao.getMyPetsDb(userId);
	}

}
