package com.qa.personexercise;

// This is the class you will be testing
public class Menu {

	PersonCreator creator;
	
	public Menu(PersonCreator creator) {
		this.creator = creator;
	}
	
	// These are the methods you will test
	public Person createFullPerson(String name, String jobTitle, int age) {
		return creator.createFullPerson(name, jobTitle, age);
	}
	
	public Person createJoblessPerson(String name, int age) {
		return creator.createJoblessPerson(name, age);
	}
	
	public Person createAgelessPerson(String name, String jobTitle) {
		return creator.createAgelessPerson(name, jobTitle);
	}
	
	public Person createNameOnlyPerson(String name) {
		return creator.createNameOnlyPerson(name);
	}
	
}
