package com.jbk.boothibrnte.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.boothibrnte.DAO.PersonsDAO;
import com.jbk.boothibrnte.entity.Persons;
import com.jbk.boothibrnte.service.PersonsService;

@RestController
@RequestMapping("/api")
public class PersonsController {
	
	@Autowired
	private PersonsService personsService;
    
	
	@GetMapping("findAll")
	public List<Persons > FindAll(){
		
		
		return personsService.FindAll();
		
	}

	
}
