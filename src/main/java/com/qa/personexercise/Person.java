package com.qa.personexercise;

public class Person {
	private String name = "";
	private String jobTitle = "";
	private int age;

	public Person(String name, String jobTitle, int age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return this.jobTitle;
	}

	public void setJob(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
