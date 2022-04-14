package com.zensar.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.dao.PersonDao;
import com.zensar.olx.model.Person;

@RestController
public class PersonController {

	@Autowired
	private PersonDao dao;
	
	
	
	@PostMapping("/savaperson")
	public String save(@RequestBody Person person)
	{
		dao.savePerson(person);
		
		return "success";
		
		
	}
	
	
	@GetMapping("getAll")
	public List<Person> getAllPersons() {
		return dao.getPersons();
				
	}
	
	
	
	
	
}
