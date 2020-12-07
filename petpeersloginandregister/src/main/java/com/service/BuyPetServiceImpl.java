package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BuyPetDao;

@Service
public class BuyPetServiceImpl implements BuyPetService{
	
	@Autowired
	BuyPetDao buyPetDao;

	public String buyPet(int petId, int userId) {
		return buyPetDao.buyPetDb(petId, userId);
	}
	
	
	
}
