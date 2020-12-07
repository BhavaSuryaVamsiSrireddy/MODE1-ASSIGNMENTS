package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GetPetsDao;
import com.model.Pets;

@Service
public class GetPetsServiceImpl implements GetPetsService {
	
	@Autowired
	GetPetsDao getPetsDao;

	public List<Pets> getPetDetails() {
		
		return getPetsDao.getPetsFromDb();
	}
	

}
