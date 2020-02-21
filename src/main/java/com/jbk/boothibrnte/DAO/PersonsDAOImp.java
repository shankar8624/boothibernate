package com.jbk.boothibrnte.DAO;

import java.util.List;


import javax.persistence.EntityManager;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.boothibrnte.entity.Persons;

@Repository
public class PersonsDAOImp implements PersonsDAO {
	
	private EntityManager entitymanager;
	
	
   @Autowired
	public PersonsDAOImp(EntityManager theEntitymanager) {

		entitymanager = theEntitymanager;
	}

   @Transactional
   @Override
	public List<Persons> FindAll() {
	   
	   Session currentSession=entitymanager.unwrap(Session.class);
	   Query<Persons> theQuery=currentSession.createQuery("from Persons",Persons.class);
		
	  List<Persons> person=theQuery.getResultList();
	  
		return person;
	}

}
