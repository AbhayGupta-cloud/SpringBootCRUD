package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CRUDbean.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/persons")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	@RequestMapping(method=RequestMethod.POST,value="/persons")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/persons/{id}")
	public void updatePerson(@PathVariable int id,@RequestBody Person person) {
		personService.updatePerson(id,person);
	}
	public void DeletePerson(@PathVariable int id) {
		personService.deletePerson(id);
	}
}
