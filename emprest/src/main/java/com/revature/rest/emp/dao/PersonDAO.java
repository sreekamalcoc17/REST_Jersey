package com.revature.rest.emp.dao;

import java.util.List;

import com.revature.rest.emp.model.Person;

public interface PersonDAO {
	public List<Person> getPersons();
	public Person getPerson(int id);
	public String addPerson(Person p);
}
