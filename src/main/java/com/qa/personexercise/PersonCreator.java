package com.qa.personexercise;

public class PersonCreator {

	public Person createFullPerson(String name, String jobTitle, int age) {
		Person person = new Person(name, jobTitle, age);
		return person;
	}
	
	public Person createJoblessPerson(String name, int age) {
		Person person = new Person(name, age);
		return person;
	}
	
	public Person createAgelessPerson(String name, String jobTitle) {
		Person person = new Person(name, jobTitle);
		return person;
	}
	
	public Person createNameOnlyPerson(String name) {
		Person person = new Person(name);
		return person;
	}
}
