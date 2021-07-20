package com.revature.rest.emp.testcode;

import java.util.List;

import com.revature.rest.emp.dao.PersonDAO;
import com.revature.rest.emp.dao.PersonDAOImpl;
import com.revature.rest.emp.model.Person;

public class Test {
public static void main(String[] args) {
	PersonDAO personDao= new PersonDAOImpl();
	List<Person> pList=personDao.getPersons();
	pList.forEach(p->System.out.println(p));
	
	Person p1=personDao.getPerson(2);
	System.out.println("Person with ID : "+p1);
	
	Person p4=new Person(4,"Rahul",23);
	String result=personDao.addPerson(p4);
	System.out.println(result);
	
}
}
