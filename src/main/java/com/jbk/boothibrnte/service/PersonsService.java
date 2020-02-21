package com.jbk.boothibrnte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.boothibrnte.DAO.PersonsDAO;
import com.jbk.boothibrnte.entity.Persons;
@Service
public class PersonsService {

	@Autowired
private PersonsDAO personDao;	

public List<Persons > FindAll(){
		
		
		return personDao.FindAll();
		
	}
	
	
}
