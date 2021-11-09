package com.thbs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Person;
import com.thbs.repo.PersonRepo;

@RestController
@RequestMapping("/Persons")
public class PersonController {
	
	@GetMapping("/getAllPersons")
	public ResponseEntity<List<Person>>getAllPersonsDetails()
	{
		PersonRepo pr=new PersonRepo();
		List<Person> plist=pr.getAllPersons();
		return new ResponseEntity<List<Person>>(plist,HttpStatus.OK);
	}
	
	@GetMapping("/getAPerson/{id}")
	public ResponseEntity<Person> getBookById(@PathVariable int id)
	{
	PersonRepo pr=new PersonRepo();
	Person p=pr.getAPerson(id);
	if(p!=null)
	{
	return new ResponseEntity<Person>(p,HttpStatus.OK);
	}
	else
	{
	return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
	}
	}
	
}
