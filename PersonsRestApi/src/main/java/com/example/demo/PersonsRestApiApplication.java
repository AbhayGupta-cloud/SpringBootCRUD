package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages={
		"com.example.demo.repository.PersonRepository"})
public class PersonsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonsRestApiApplication.class, args);
	}

}
