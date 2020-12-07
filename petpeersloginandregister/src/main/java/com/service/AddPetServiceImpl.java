package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AddPetDao;
import com.model.Pets;

@Service
public class AddPetServiceImpl implements AddPetService{

	@Autowired
	AddPetDao addPetDao;
	public String registerNewPet(Pets pet,int userId) {
		return addPetDao.getNewPetDetails(pet,userId);
	}

}
