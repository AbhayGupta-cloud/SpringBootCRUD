package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.CRUDbean.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	public PersonRepository personRepo;
	public List<Person> getAllPersons(){
		List<Person> p=new ArrayList<>();
		personRepo.findAll().forEach(p::add);
		return p;
	}
	@RequestMapping(method=RequestMethod.POST,value="/persons")
	public void addPerson(Person person) {
		personRepo.save(person);
	}
	public void updatePerson(int id, Person person) {
		personRepo.save(person);
		
	}
	public void deletePerson(int id) {
		personRepo.deleteById(id);
		
	}
}
