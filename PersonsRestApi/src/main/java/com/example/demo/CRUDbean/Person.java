package com.example.demo.CRUDbean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int age;
	public Person(int id, String name, int age, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
