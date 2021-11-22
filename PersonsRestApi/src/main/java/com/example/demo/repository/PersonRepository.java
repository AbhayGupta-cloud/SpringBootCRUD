package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.CRUDbean.Person;
@Repository
@Component
public interface PersonRepository extends CrudRepository<Person,Integer> {
	
}
