package com.jbk.boothibrnte;


	import java.util.List;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.jbk.boothibrnte.DAO.PersonsDAO;
import com.jbk.boothibrnte.DAO.PersonsDAOImp;
import com.jbk.boothibrnte.entity.Persons;
import com.jbk.boothibrnte.service.PersonsService;
	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class BoothibernateApplicationTests {
	    @Autowired
	    PersonsService personservice;
	    
	    @MockBean
	    PersonsDAO persondao;
	    

	    public void findallTest() {
	    	
	    	
	    	}

}
